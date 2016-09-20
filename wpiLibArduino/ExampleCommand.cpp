#include "ExampleCommand.h"
#include "MotorController.h"
#include "Robot.h"

ExampleCommand::ExampleCommand(int portL, int portR): motorL(portL), motorR(portR)
{
}

void ExampleCommand::initialize()
{
	motorL.setOutput(0);
	motorR.setOutput(0);
	Robot::getInstance()->log("Starting example command");
}
void ExampleCommand::execute()
{
	static bool increasing = true;
	static float speed = 0;
	motorL.setOutput(speed);
	motorR.setOutput(speed);
	speed += .001 * (increasing ? 1 : -1);
	if(speed > 1)
	{
		speed = 1;
		increasing = false;
		Robot::getInstance()->log("Speed over 1, decreasing");
	}
	else if(speed < -1)
	{
		speed = -1;
		increasing = true;
		Robot::getInstance()->log("Speed under -1, increasing");
	}
}
bool ExampleCommand::isFinished()
{
	static uint16_t counter = 0;
	return counter++ > 10000;
}
void ExampleCommand::end()
{
	Robot::getInstance()->log("Ending example command");
	motorL.setOutput(0);
	motorR.setOutput(0);
}
