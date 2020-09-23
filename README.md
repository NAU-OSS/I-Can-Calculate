
I Can Calculate


## Description:  
## Description:  
To create a child’s calculator in android studio.
To create a child’s calculator in android studio app.


## Features: 
## Features: 
Top of the calculator will display the current calculation followed by answer after equals button is pressed.
Top of the calculator will display the current calculation followed by answer after equals button is pressed.
@@ -12,16 +12,20 @@ Create a sting containing the input/output line content as buttons are pressed.
Play linked audio clips on press of input/output line.
Play linked audio clips on press of input/output line.


## Buttons:  
## Buttons:  
Should be color coded each number/operator assigned a unique color and image displaying a representational image. On press should have audio-clip of number play in child           friendly voice (perhaps my version of micky would allow for clip recording if can’t source audio files.) number/operator should appear in input/output line.
Should be color coded each number/operator assigned a unique color and image displaying a representational image.
          Note: might make extra button “play” for visibility instead, or as well as clickable input/output.
On press should have audio-clip of number play in child           
friendly voice (perhaps my version of micky would allow for clip recording if can’t source audio files.)
number/operator should appear in input/output line.
Note: might make extra button “play” for visibility instead, or as well as clickable input/output.


## General behaviors:
## General behaviors:
1)	Number is pressed sound clip plays number added to Input/output screen.
1)	Number is pressed sound clip plays number added to Input/output screen.
a)	Special case equals has been pressed play audio-clip clear input/output display new number 
a)	Special case equals has been pressed play audio-clip clear input/output display new number 
2)	Operator is pressed sound clip plays operator added to Input/output screen.
2)	Operator is pressed sound clip plays operator added to Input/output screen.
a)	Special case equals play affirmation sound, displays results of calculation if operator has been pressed previously otherwise do nothing and play negative sound.
a)	Special case equals play affirmation sound, displays results of calculation if operator has been pressed previously,
          otherwise do nothing and play negative sound.
3)	Input/output line or read button pressed then displayed string is read play constructed audio.
3)	Input/output line or read button pressed then displayed string is read play constructed audio.
    (see input/output line).
          (see input/output line).
4)	Clear is pressed clear input/output play button press play affirmation sound-clip for feedback.
4)	Clear is pressed clear input/output play button press play affirmation sound-clip for feedback.
