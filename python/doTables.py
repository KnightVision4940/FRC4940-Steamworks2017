#!user/bin/env python3
#
#stew wrote this test stuff
#based on pynetworktables.pdf from media.readthedocs.org or somethin idk

import time
from networktables import NetworkTables
import logging
logging.basicConfig(level=logging.DEBUG)

#get smart dashboard
sd = NetworkTables.getTable("SmartDashboard")

i = 0
while True:
	try:
		print('dsTime:', sd.getNumber('dsTime'))
	except KeyError:
		print('dsTime: N/A')
	
	sd.putNumber('robotTime', i)
	time.sleep(1)
	i += 1

