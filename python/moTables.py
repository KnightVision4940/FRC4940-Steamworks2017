#!/usr/bin/env python3
#
# This is a NetworkTables client (eg, the DriverStation/coprocessor side).
# You need to tell it the IP address of the NetworkTables server (the
# robot or simulator).
#
# When running, this will create an automatically updated value, and print
# out the value.
#

import sys
import time
from networktables import NetworkTables

# To see messages from networktables, you must setup logging
import logging
logging.basicConfig(level=logging.DEBUG)

if len(sys.argv) != 2:
  print("Error: specify an IP to connect to!")
  exit(0)

ip = sys.argv[1]

NetworkTables.initialize(server=ip)

sd = NetworkTables.getTable("SmartDashboard")
auto_value = sd.getAutoUpdateValue('noValue', 0)
i=0
while True:
  print('myValue:', i)
  time.sleep(1)
  i = i + 1
  sd.putNumber("myValue", i)
