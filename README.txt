project 3

/*
 * Name: Xinyi Chen, Shengyuan Huang, Yize Jin 
 * NetID: xchen92, shuang48, yjin25
 * project2
 * LAB MW 18:15-19:30 (Xinyi) MW 1650-1805(Shengyuan) MW 1650-1805(Yize)
 * Xinyi Chen and Shengyuan Huang, and Yize Jin worked together on this assignment.
 */

Our project creates one primary class, namely FireWork, 
which is in charge of creating numerous swing components and serving 
as the administrator that calls other sub-methods. Our program extends 
JFrame, uses components including JButton, JLabel, JSlider, and implements 
ActionListener, MouseListener, and ChangeListener. 

At first, the main interface shows up, asking the user to assign the angle, 
speed, time, and color of the firework, and then allows them to choose one 
type among five totally. No matter what type of firework they choose, a 
new window shows up, directly showing the trajectory of the firework after 
launching before exploding. Then, the instruction tells the user to click on 
the screen in order to explode the firework. Our five types of fireworks are 
different in shape and setting. In the first three types of fireworks, 
the user can see the explosion by clicking on the screen. 

In Type_1 class, we create a uni-centered circle firework and meet the 
requirement of extra credit one. We fire two identical fireworks from different 
original position, and check whether they are close enough after launching. 
If it is, we inform the user with a message. In Type_2 class, a random circle 
explosion is created. In Type_3, we uses numerous asterisks(*) to form the firework. 

In type 4 and 5, however, we meet the requirement of extra credit three, 
which breaks the projectile into several smaller pieces, each of which shoot off in 
some direction and then explode separately. The user first presses the mouse in order 
to see three different split paths, and then releases the mouse to see the explosions. 

In Type_4 class, a fill uni-circle explosion firework is created, and in Type_5 class, 
a clover-shaped firework is created. After the explosion, the user can end the session by 
closing the window.

Extra credits are met on:
1 Support firing a two projectiles towards each other--Type_1)
2 Support the first explosion of some fireworks breaks the projectile into several smaller pieces, each of which shoot off in some direction and then explode separately. (Tpye_4 and 5)
3 used special signs for the explosion(*)(Type_3)

All of codes are in the src folder.