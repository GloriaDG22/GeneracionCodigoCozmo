@echo off

IF %1 == "true" (
	netsh wlan connect name=Cozmo_718BE8
	echo Connect to Cozmo
)ELSE (
	netsh wlan connect name=MiFibra-D472-5G
	echo Connect to MiFibra-D472
)