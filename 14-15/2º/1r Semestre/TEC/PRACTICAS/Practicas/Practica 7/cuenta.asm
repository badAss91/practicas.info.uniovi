	LIST P=16F877
	INCLUDE P16F877.INC
	CONTADOR EQU 0X20
	ORG 0
	BSF STATUS, RP0
	CLRF TRISB
	BCF STATUS, RP0
	CLRF CONTADOR
	CLRF PORTB
PULSA BTFSS PORTA,4
	CALL INCREMENTO
	GOTO PULSA
INCREMENTO 
	INCF CONTADOR, F
	MOVF CONTADOR, W
	MOVWF PORTB
SUELTA BTFSS PORTA,4
	GOTO SUELTA
	RETURN
	END