
import pycozmo
import time

import TareasGenericas as mycozmo

import tkinter as tk

def andaYGira(cli, n_velocidad_Andar = 1
, tiempo_Andar = 2
, girar_Andar = False

, n_velocidad_Retroceder = 4
, tiempo_Retroceder = 2
, girar_Retroceder = False

, n_velocidad_Girar = 1
, tiempo_Girar = 3
, girar_Girar = True

):
    '''-------------Andar - MOVERRUEDAS-------------'''
    mycozmo.moverRuedas(cli, n_velocidad_Andar, tiempo_Andar, girar_Andar)
    
    '''-------------Girar - MOVERRUEDAS-------------'''
    mycozmo.moverRuedas(cli, n_velocidad_Girar, tiempo_Girar, girar_Girar)
    
    '''-------------Retroceder - MOVERRUEDAS-------------'''
    mycozmo.moverRuedas(cli, n_velocidad_Retroceder, tiempo_Retroceder, girar_Retroceder)
    




'''-----------------------------        MAIN         ------------------------------'''
if __name__ == '__main__':
    '''-----------------------------Comenzar conexion------------------------------'''
    cli = pycozmo.Client()
    cli.start()
    cli.connect()
    cli.wait_for_robot()

    '''------------------------------Levantar cabeza-------------------------------'''
    angle = (pycozmo.robot.MAX_HEAD_ANGLE.radians - pycozmo.robot.MIN_HEAD_ANGLE.radians) / 2.0
    cli.set_head_angle(angle)

    '''--------------------------Llamada a metodo inicial---------------------------'''
    andaYGira(cli) 

    '''-----------------------------Finalizar conexion------------------------------'''
    cli.set_head_angle(pycozmo.robot.MIN_HEAD_ANGLE.radians)
    time.sleep(1)

    cli.disconnect()
    cli.stop()
