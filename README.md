# SciFi UI Project

Name: *David Tilson*

Student Number: *C17448206*

# Description of the assignment:

This assignemt is an interactive map of the distant solar system "TRAPPIST-1". TRAPPIST-1 is a solar system orbiting an ultra-cool red dwarf star "TRAPPIST-1" that is slightly larger, than the planet Jupiter. This solar system has peaked scientists curiousity after being found in 1999 during the [Two Micron All-Sky Survey2MASS](https://en.wikipedia.org/wiki/2MASS) . However it wasnt fully examined until 2015, when a team at the University of Léige observed the solar system for six months.


# Instructions

The map itself is interactive, by using the left and right arrow keys users can respectively speed up or slow down the speed at which the planets orbit the star. By pressing the Space Bar the speed of the planets rotation is normalised to their origional speed at launch of the application. 

A user help menu is also implemented in this program. By holding the enter key a menu is shown on screen. This menu shows the user the controls of how to use the maps interactive features while also giving a brief summary of the solar system itself.

Information about each of the planets is printed to the command line at the start of the programs run-time. This information is read in from a .CSV file and then printed onwards.

# How it works

When the program is ran seven planets methods, a background method, a sun method and a menu method are all created. These methods are then passed their necessary variables which gives the classes everything that they need to work as intended.

### StarBackground class
The *StarBackground* class is the first class called upon in the setup() function. A black background is drawn. Then the background is populated by yellow points, meant to be distant stars in space. The stars are drawn using a nested for-loop. I and J are incremeted by different amounts, these also serve as the X and Y co-ordinates for the points. This eliminates any hard-coding by looping through a nested for-loop and populating the sky with stars.

After the background stars have been drawn, the orbital paths of the planets are drawn. This is also done with a for-loop where each circles diameter is increased by 110 pixels, allowing for all 7 to be drawn while also maximising space on the screen. These circles are firstly set to noFill() to stop any overlapping issues.


# What I am most proud of in the assignment

In this assignment I am most proud of getting the planets to move in line with their drawn orbital paths around the star. Although in the end it was a quick and simple fix. I was stuck on this for quite some time but I couldnt let it go, I ended up spending two hours figuring it out. Once I finally completed this part of the program, I had a big smile on my face for the remainder of the day, simply because of how long it was bothering me.

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

