# SciFi UI Project

Name: *David Tilson*

Student Number: *C17448206*

# Description of the assignment:

This assignemt is an interactive map of the distant solar system "TRAPPIST-1". TRAPPIST-1 is a solar system orbiting an ultra-cool red dwarf star "TRAPPIST-1" that is slightly larger, than the planet Jupiter. This solar system has peaked scientists curiousity after being found in 1999 during the [Two Micron All-Sky Survey2MASS](https://en.wikipedia.org/wiki/2MASS) . However it wasnt fully examined until 2015, when a team at the University of Léige observed the solar system for six months.

![An image](Images/trappist-a.jpg)




# Instructions

The map itself is interactive, by using the left and right arrow keys users can respectively speed up or slow down the speed at which the planets orbit the star. By pressing the Space Bar the speed of the planets rotation is normalised to their origional speed at launch of the application. 

A user help menu is also implemented in this program. By holding the enter key a menu is shown on screen. This menu shows the user the controls of how to use the maps interactive features while also giving a brief summary of the solar system itself.

Information about each of the planets is printed to the command line at the start of the programs run-time. This information is read in from a .CSV file and then printed onwards.

# How it works

When the program is ran seven planets methods, a background method, a sun method and a menu method are all created. These methods are then passed their necessary variables which gives the classes everything that they need to work as intended.

### StarBackground class
The *StarBackground* class is the first class called upon in the setup() function. A black background is drawn. Then the background is populated by yellow points, meant to be distant stars in space. The stars are drawn using a nested for-loop. I and J are incremeted by different amounts, these also serve as the X and Y co-ordinates for the points. This eliminates any hard-coding by looping through a nested for-loop and populating the sky with stars.

After the background stars have been drawn, the orbital paths of the planets are drawn. This is also done with a for-loop where each circles diameter is increased by 110 pixels, allowing for all 7 to be drawn while also maximising space on the screen. These circles are firstly set to noFill() to stop any overlapping issues with circles being drawn over each other.

### Planets Class
The *Planets* class is the most complex class in the program. Within the constructor of this class, 13 variables alone are initialised for later use. 

Within the render() function the planets themselves are drawn. The planets are coloured by using an RBG scale, passed from the UI Class, allowing each planet to be a different colour entirely. Next is where I had the most trouble in this assignment, the PVectors and getting them to work properly to allow the planets to orbit the Star along the Orbital Path Lines which were drawn earlier in the StarBackground class. Origionally I tried to use while-loop to draw each planet, however this led me to a few problems. Functionality wise I could not get the orbits to work properly doing so, it also meant that all of the planets had to be one singular colour moving in unison around the circle. I tried this way first as it origionally seemed the better way to do so, rather than hard-coding each of the 7 planets in individually. After trying to get it to work for over two hours I swapped to implementing each planet seperately and it caused no issues. The PVectors for getting the planets to work are quite simple, I used the *sin* and *cos* functions multiplied by the radius of the circle (the orbital path circle mentioned previously).

Within the update() function of the Planets class, theta is being added on by ((Two PI * Time) / Speed), which is what updates constantly to drive the PVectors to move themselves around the orbit of the Star. The *Speed* variable can be incremented or decremented by users by pressing the left or right arrow keys respectively. Also within the update() function there is an if statement, the purpose of it is as controlling code to not allow the user to infinitely increase the speed at which the planets rotate, as this leads to graphical bugs once the speed is high enough ( planets disapear from the map never to come back again)

And finally within the Planets class are a plethora of Setter/Getter functions, for each of the variables which are read from the .CSV file mentioned earlier.

### Menu Class
The *Menu* Class is within an statement within UI.Java as I wanted it to appear and disapear within a certain set of conditions. In this case, the condition being the Enter Key being pressed down. If the user presses the Enter Key, menu.render() is called and the menu itself is drawn on screen for the users to see. 

The menu screen itself is a black background with white coloured writing. It uses the text() function to process the writing which is intended to be shown to the user. Instructions are shown to the user on how to interact with the map. Also a small bit of information about the solar system itself is shown to the user. This is quite a straight-forward class, with 800 and 800 being passed to it from UI when it is called, as these are used in the calculations within the class. 800 being both the height and width of the drawn screen.

### Sun Class
The *Sun* Class is the file which handles with the drawing of the star in the center of the solar system itself. This is quite straight-forward as it is just a red coloured circle in the center of the screen, with noStroke() also being implemented to stop an outline around the star. The stars co-ordinates come from UI.Java where they are passed from. scWidth and scHeight are the variables holding this information. As I needed the Sun in the center of the screen, I set its co-ordinates to x = scWidth / 2 and y = scHeight / 2.


# What I am most proud of in the assignment

In this assignment I am most proud of getting the planets to move in line with their drawn orbital paths around the star. Although in the end it was a quick and simple fix. I was stuck on this for quite some time but I couldnt let it go, I ended up spending two hours figuring it out. Once I finally completed this part of the program, I had a big smile on my face for the remainder of the day, simply because of how long it was bothering me. Even though this section of code was not the most difficult or obscure, the fact that I powered through it and figured it out after being stuck on it for some time, felt like an accomplishment within itself. That is why the movement of the planets around the Star is what I am most proud of in this assignment.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item


This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

