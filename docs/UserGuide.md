# User Guide  
  
### Introduction  
  
Zoomaster is a desktop app for organizing website links, optimized for use via a Command Line 
Interface (CLI) while retaining the benefits of a Graphical User Interface (GUI). If you can 
type fast, Zoomaster can help fetch useful website links for you quicker than the bookmark 
function on your browser. This user guide will walk you through the features of Zoomaster and 
how to input the commands.

### Table of Contents
* [1. Quick Start](#quick-start)
* [2. About This Document](#about)
* [3. Features](#features)
  * [3.1 Global](#global)
    *  [3.1.1. Show Help Information:](#help) **help**
    *  [3.1.2. Switch Mode:](#mode) **mode**
    *  [3.1.3. Launch Current Lesson:](#launchnow) **launch now**
    *  [3.1.4. Show User Settings:](#showsettings) **showsettings**
    *  [3.1.5. Set a Setting:](#setsetting) **set**
    *  [3.1.6. Clear:](#clear) **clear**
    *  [3.1.7. Exit:](#exit) **exit**
  * [3.2 Bookmark Mode](#bookmarkmode)
    * [3.2.1. Show Bookmarks:](#showbookmark) **show**
    * [3.2.2. Add Bookmarks:](#addbookmark)  **add**
    * [3.2.3. Delete Bookmarks:](#deletebookmark)  **delete**
    * [3.2.4. Edit Bookmarks:](#editbookmark)  **edit**
    * [3.2.5. Find Bookmarks:](#findbookmark)  **find**
    * [3.2.6. Launch Bookmarks:](#launchbookmark)  **launch**
  * [3.3 Timetable Mode](#timetablemode)
    * [3.3.1. Show Timetable:](#showtimetable) **show**
    * [3.3.2. Show Modules, Slots, and Bookmarks:](#showmoduledetails) **show**
    * [3.3.3. Add Modules, Slots, and Bookmarks:](#addtimeslot) **add**
    * [3.3.4. Delete Modules, Slots, and Bookmarks:](#deletetimeslot)  **delete**
    * [3.3.5. Edit Modules, Slots, Titles, and Time:](#edittimeslot)  **edit**
    * [3.3.6. Launch Bookmarks from a Module or Slot:](#launchtimeslot)  **launch**
  * [3.4 Planner Mode](#plannermode)
    * [3.4.1. Load Planner:](#loadplanner) **load**
    * [3.4.2. Add Meeting:](#addmeeting) **add**
    * [3.4.3. Show Planner:](#showplanner) **show**
    * [3.4.4. Save Planner:](#saveplanner) **save**
* [4. FAQ](#faq)
* [5. Command Summary](#command-summary)

<br>

<a name="quick-start"></a>
## 1. Quick Start  
  
1. Ensure that you have Java 11 or above installed.

2. You can download the latest version of `Zoomaster` from [here](https://github.com/AY2021S1-CS2113T-W11-1/tp/releases).

3. Now, move the `zoomaster.jar` file into your desired folder for Zoomaster.

4. Copy the absolute path of your `zoomaster.jar` file by holding the <kbd>Shift</kbd> key on your keyboard and
_right-click_ the file, then select the option `Copy as path`.

5. Start the Command Prompt, type in "java -jar", then paste the absolute path that you just copied previously.
It should look something similar to `C:\Users\user>java -jar "C:\Users\user\Downloads\zoomaster.jar"`.

6. Finally, press <kbd>Enter</kbd>. You should see the Zoomaster logo indicating 
that you have successfully started Zoomaster.<br><br>
![](./images/zoomasterIcon.png)

7. The app is now ready to go! Go ahead and test it out with the `help` command. 
The app should print out a list of different commands.

8. You can now refer to the sections below to explore the different features of the Zoomaster app.

<br>

<a name="about"></a>
## 2. About this Document

<a name="command_format"></a>
Please take note these labels below on command formatting:

| Label | Meaning |
| --- | --- |
| `{curly brackets}` | Words contained in `{curly brackets}` are parameters to be supplied by the user. <br> E.g., in `delete {BOOKMARK_NUMBER}`, `BOOKMARK_NUMBER` is a parameter which can be used as `delete 1`.
| `{PARAM1/PARAM2}` | Parameters with `/` inside are parameters that accept different types of inputs. <br> E.g., `launch {INDEX/DESCRIPTION}` shows that either `INDEX` or `DESCRIPTION` can be used.
| `(optional)` | Parameters with `(optional)` are optional inputs. <br> E.g., `show {DAY(optional)}` can be used as `show` or as `show mon`.
| `DAY` | Parameter `DAY` takes three-letter abbreviations of days in a week. <br> The full list of DAY parameters are `mon`, `tue`, `wed`, `thu`, `fri`, `sat`, `sun`.<br> Your inputs need not be case sensitive. <br> E.g., `show {DAY(optional)}` can be used as `show mon`, `show tue`, etc.
| `MODULE` | Parameter `MODULE` has to be an NUS module recognised by NUSMods. <br> You can go to https://nusmods.com/ to get the full list of NUS modules available. <br> E.g., `CS2113`, `CS2101`
| `START TIME` | Parameters `START TIME` and `END TIME` requires input to be in the format `HH:mm` and in 24-hour clock system. <br> E.g., `12:00`, `14:00`, `00:00`

<br><br>

## 3. Features   

This section will explain to you the different features of Zoomaster and how you can interact with it.

<!-- @@author fchensan -->
Zoomaster has three different modes:

* **Bookmark mode** : In this mode, Zoomaster stores all of your bookmarks that are not related to any modules.
* **Timetable mode** : Here, you can create a timetable of all of your classes, and assign a bookmark or Zoom link on each of the time slots.
* **Planner mode** : Here, Zoomaster can help you find the common empty time slots by importing your teammates' timetables.

Each mode has its own different sets of features and commands, which will be explained in the sections below.
<!-- @@author -->

<br>

<a name="global"></a> 
### 3.1 Global Commands

These commands can be used by you in every mode of the app.

<br>

<a name="help"></a>  
#### 3.1.1. Show help information: `help` (Yu Shing + Zhan Hao)
You can see the list of commands available in the mode you are currently in.
```
Format: help {COMMAND(optional)}
```
>Let's say you require help to see the commands you can access the main menu mode. 
>You will first enter `help` into the console.
>
>Then, you should see the following message to guide you with the relevant commands.
>
>![](./images/showhelpcommand%20main%20menu.png?raw=true)
>
>Typing `help` in bookmark mode will show these commands.
>
>![](./images/showhelpcommand%20bookmark.png?raw=true)

<br>

If you require additional information about a command, you can insert the optional parameter of `{COMMAND}` 
after `help` show you additional information about the commands and how to format the command properly.

Example of usage:   
* `help add`
* `help delete`

>You should see the following message if you enter `help add` in timetable mode.
>
>![](https://github.com/TYS0n1/tp/blob/team-Branch2/docs/diagrams/help%20add%20msg.png?raw=true)

<br>

<!-- @@author TYS0n1 -->
<a name="mode"></a>  
#### 3.1.2. Switch mode: `mode` (Yu Shing)
There are three modes in Zoomaster: **bookmark**, **timetable** and **planner** modes and you can switch between them. Depending on the mode you select, the behaviour of the commands below changes.

There are three modes for Zoomaster., Bookmark, Timetable and Planner modes.
```
Format: mode {bookmark/timetable/planner}
```

Example of usage:   
* `mode bookmark`
* `mode timetable` 
* `mode planner`

>Here is an example of switching from the main menu of Zoomaster to the bookmark modes.
>
>![](https://github.com/TYS0n1/tp/blob/master/docs/images/changemodecommand%20main%20menu%20to%20bookmarks.png?raw=true)
>
>For the other modes, you should see a similar message like "changing to timetable/planner mode".

<br>

<a name="launchnow"></a>  
<!-- @@author xingrong123-->
#### 3.1.3. Launch bookmarks of current lesson: `launch now` (Xing Rong)
You can launch the bookmarks of a current lesson slot in your timetable. 
The time depends on the system time of your machine with an additional 5 minutes of buffer, 
allowing you to launch your zoom session ahead of time.
  
```
Format: launch now    
```

>Here is an example of launching the bookmark of the current lesson. In this case, the URL attached to the slot
>is www.google.com.
>
>![](./images/launchnow.png)

You should expect to see the urls of the current or 5 minutes advance lesson slot launching
in your native browser. Otherwise, you should see the message `no lesson now`.
<!-- @@author -->

<br>

<!-- @@author fchensan -->
<a name="showsettings"></a>  
#### 3.1.4. Show settings: `showsettings` (Francisco)
Once you are comfortable using Zoomaster, this command, along with the `set` command, helps you customise Zoomaster's behaviour.
```
Format: showsettings
```
When you type in this command, you will see two settings that you can adjust:
```
[def_mode] Default mode at start-up: <<mainmenu>> timetable bookmark
[autosave] Autosave after each command (if off, only save on exit): <<on>> off
```

The two settings are:
* Default mode at start-up.
    You can choose between `mainmenu`, `timetable`, or `bookmark` as the first mode you will enter when you start Zoomaster.
* Autosave.
    By default, this is turned on and Zoomaster will save files every time you make changes. You might want to turn this off if you prefer to save only when you exit. 

<br>

<a name="setsetting"></a>  
#### 3.1.5. Set a setting: `set {SETTING_NAME} {NEW_OPTION}` (Francisco)
While `showsettings` shows you the settings, this command lets you change one of the settings.
* `{SETTING_NAME}` is the name of the setting as shown when you type in the `showsettings` command.
* `{NEW_OPTION}` is the new setting option that you would like to select. This needs to be typed in exactly as show from the `showsettings` command.

For example, let's say that you want Zoomaster to enter `bookmark` mode when you start it.

>You can type in `set def_mode bookmark` and Zoomaster will change your settings, as shown below.  
>
>![](https://raw.githubusercontent.com/fchensan/tp/docs-images/docs/images/setsettings.png)

The next time you run Zoomaster, you will automatically enter `bookmark` mode.

<br>

<!-- @@author Speedweener -->
<a name="clear"></a>  
#### 3.1.6. Clear screen: `clear` (Zhan Hao)

You can clear the command prompt screen using this command. 
It is useful when your screen gets cluttered with prior commands. For example, when you have added a whole bunch
of modules and timeslots to your timetable. Then you can use `clear` command to remove those commands. <br></br>
Note that if your monitor screen has high dimensions, you might need multiple calls of this command to fully
clear your screen.
```
Format: clear
```

>Here is an example of clearing the screen using the clear command.
>
>![](./images/clear.png)

<br>

<!-- @@author -->
<a name="exit"></a>  
#### 3.1.7. Exit the app: `exit`  
You can exit the application by using the exit command.  
```
Format: exit
```
>You should see this message on exit.
>
>`Bye. Hope to see you again soon!`

<br>
<br> 


<a name="bookmarkmode"></a>  
### 3.2. Bookmark Mode  

<!-- @@author Speedweener -->
<a name="showbookmark"></a>   
#### 3.2.1. Show bookmarks: `show` (Zhan Hao)
This feature helps you print out all bookmarks in your bookmark list.
```
Format: show
```
>Example of a printed out bookmark list.  
>
>![](./images/showOutput.PNG)
>
>If your bookmark list is empty, you will get the message shown in the screenshot below.  
>
>![](./images/showEmptyBookmarks.PNG)

<br>

<a name="addbookmark"></a>  
#### 3.2.2. Add bookmark: `add` (Zhan Hao)
You can add bookmarks to your bookmark list. A bookmark contains its description and URL.

>* The validity of the `URL` you entered cannot be checked. Please ensure that you entered the correct link. 
>* Your `DESCRIPTION` must only contain one word (no whitespace inside). You can use underscore("_") or dashes("-") to string
>multiple words together. Eg. "github_team_repo" or "cs2113t-website".
>* Your input `URL` has to start with `www.`, `http://` or `https://`.

```
Format: add {DESCRIPTON} {URL}
``` 

Example of usage:
* `add google www.google.com/`  
* `add example http://example.com`  
* `add cs2113t-website https://nus-cs2113-ay2021s1.github.io/website/`  

<br>

<a name="deletebookmark"></a>  
#### 3.2.3. Delete bookmarks: `delete` (Zhan Hao)
Deletes a bookmark with the specified index.  
The index will correspond to the index of that bookmark in the list. 
You can do a `show` command to check the bookmark indexes.  

```
Format: delete {INDEX}
```

Example of usage:
* `delete 2`  
* `delete 4`  

>You should see a message similar to the screenshot below.  
>
>![](./images/deletebookmarksoutput.PNG)

<br>

<!-- @@author fchensan -->
<a name="editbookmark"></a>  
#### 3.2.4. Edit bookmarks: `edit` (Francisco) 
This command edits a bookmark's description or URL with the specified index.  
Just like `delete`, the index will correspond to the index of that bookmark in the list. 
You can do a `show` command to check the bookmark indexes.  

```
Format: edit {desc/url} {INDEX}
```

You should enter a `desc` or `url` depending on which one you want to edit.

> For example, let's say that you have `[news] www.straitstimes.com` as your third bookmark on the list.
> You can type in `edit desc 3 straitstimes` to change the description to "straitstimes". The following message will 
> appear:
>
>`Bookmark description updated!`

<br>

<!-- @@author Speedweener -->
<a name="findbookmark"></a>  
#### 3.2.5. Find bookmarks: `find` (Zhan Hao) 
You can use this command to find bookmarks with matching description.

>Your `DESCRIPTION` must only contain one word (no whitespace inside). 
>See the [command format](#command_format) for more details.

```
Format: find {DESCRIPTION}
```

Example of usage: 
* `find cs2113t-website`
* `find notes`  

>You should see a message similar to the screenshot below when a successful match is found.  
>
>![](./images/findBookmarkoutput.PNG)
>
>Else you should see the following message:
>
>`No bookmarks contain the specified keyword!`

<br>

<a name="launchbookmark"></a>  
#### 3.2.6. Launch bookmarks: `launch` (Zhan Hao)  
You can use this feature to launch bookmarks in your native browser.

Your selection of bookmark(s) can be via _index_ or _matching description_.
The index will correspond to the index of that bookmark in the list. 
You can do a `show` command to check the bookmark indexes.  

>Your `DESCRIPTION` must only contain one word (no whitespace inside). 
>See the [command format](#command_format) for more details.

```
Format: launch {INDEX/DESCRIPTION}
``` 

Example of usage:  
* `launch 1`  
* `launch cs2113t-website`  
* `launch abc`  

<br>
<br>

<a name="timetablemode"></a>  
### 3.3. Timetable mode    

<!-- @@author TYS0n1 -->
<a name="showtimetable"></a>
#### 3.3.1. Show timetable: `show` (Yu Shing)
You will be able to see the timetable for a certain day or the whole week.

If your selected timetable is the current day, you should be able to see a
`<current time>` indicator with your system local time. Otherwise, if you
have a lesson ongoing currently, it will show a `<lesson now>` indicator
*around* your current lesson instead.

>* You have to enter `DAY` input according to the command format else it will not be recognised as a valid date. 
>The valid inputs are `mon`, `tue`, `wed`, `thu`, `fri`, `sat`, `sun` and `today`. 
>You can see the [command format](#command_format) for more information.
>
>* Zoomaster will interpret your command as the [show module and slot feature](#showmoduledetails) 
>if you do not enter the correct `DAY` input. As such, you would see an error message saying you have entered an invalid module.

```
Format: show {DAY(optional)}
```

Example of usage:   
* `show`
* `show wed`
* `show today`

Here are some examples of outcomes you will see on the command line interface.

>You will see an empty list message if your timetable is empty.
>
>![](https://github.com/TYS0n1/tp/blob/master/docs/images/showtimetablecommand%20empty%20timetable.png?raw=true)
>
>You will see your entire timetable if you use `show` input.
>
>![](https://github.com/TYS0n1/tp/blob/master/docs/images/showtimetablecommand%20all%20timetable.png?raw=true)
>
>You will see the timetable of your selected day if you use `show {day}` input.
>
>![](https://github.com/TYS0n1/tp/blob/master/docs/images/showtimetablecommand%20today%20timetable.png?raw=true)

<br>

<!-- @@author xingrong123-->
<a name="showmoduledetails"></a>
#### 3.3.2. Show module and slot details: `show` (Xing Rong)
You can use this command to show the details of a module or slot that has been added.

You can see the respective indexes of each of the slots from the module 
and using the `bookmarks` keyword will show the bookmarks which are saved in the module and its slots.

>You can only see modules that are listed on the NUSMods website. 
>You can see the [command format](#command_format) for more information.

```
Format (show module details): show {MODULE} bookmarks(optional)
```

Example of usage:   
>`show CS2113T`  
>
>![](./images/showTimetableCommand/showmoduleoutput.PNG)  
>
>`show CS2113T bookmarks`  
>
>![](./images/showTimetableCommand/showmodulebookmarksoutput.PNG)

<br>

<a name="addtimeslot"></a>
#### 3.3.3. Add module, time slot and bookmark: `add` (Xing Rong)
You can add modules, time slots and bookmarks using this feature.
You can also chain commands when adding multiple slots and bookmarks to a module by using `,` as a separator.

>* You are required to insert **a space** between each parameter.
>* The chaining of commands only performs on **one module** which is `{MODULE}`.    
>* You can only add a module that is listed on the NUSMods website. 
>* Your `DESCRIPTION` must only contain one word (no whitespace inside). 
>You can see the [command format](#command_format) for more details.
>* Your input `URL` has to start with `www.`, `http://` or `https://`.
>* The validity of the `URL` you entered cannot be checked. Please ensure that you entered the correct link. 
>* You have to enter `DAY` input according to the command format else it will not be recognised as a valid date. 
>The valid inputs are `mon`, `tue`, `wed`, `thu`, `fri`, `sat`, `sun`and `today`. 
>You can see the [command format](#command_format) for more information.
>* The period you enter from `{START_TIME}` to `{END_TIME}` cannot cross over midnight. 
>E.g., 23:30 to 00:30 is not a valid period you can enter.
>You can work around this by splitting up your timeslot into two periods, one before midnight and one after.
>E.g., 23:30 to 23:59 and 00:00 to 00:30

```
Format (adding a module): add {MODULE}

Format (adding a slot to a module): add {MODULE} {DESCRIPTION} {DAY} {START_TIME} {END_TIME} 

Format (adding a bookmark to a module): add {MODULE} {DESCRIPTION} {URL}

Format (adding a bookmark to a slot): add {MODULE} {DESCRIPTION} {DAY} {START_TIME} {END_TIME} {URL}
                                      add {MODULE} {INDEX} {URL}

Format (chaining commands): add {MODULE} {DESCRIPTION} {DAY} {START_TIME} {END_TIME} {URL}, {DESCRIPTION} {URL}, ...
```  

* Multiple bookmarks can be added to a module and a slot.

  * To add another bookmark to an existing module, you have to enter the module code of the 
    existing module in the timetable. 
  * To add another bookmark to an existing slot, you can enter the command with the matching details 
    of the existing slot or use the index number of the slot in the module to access the slot. 
    The index number of the slot can be found by using the command `show {MODULE}`.

* Each command works by checking if each of the components (module, slot, bookmark) 
  exists or is valid from left to right of the input before adding them.
  * In the command `add cs2113t lecture fri 16:00 18:00`, if `cs2113t` module already exists, 
    then it will not be added into the timetable. The slot `lecture fri 16:00 18:00` 
    will then be added to the existing `cs2113t` module.

<br>

Example of usage: 

**Adding a module**
>`add CS2113T`
>
>![](./images/addSlotCommand/addmoduleoutput.PNG)

**Adding a slot to a module**
>`add CS2102 tutorial fri 10:00 12:00`
>
>![](./images/addSlotCommand/addslottomoduleoutput.PNG)

**Adding a bookmark to a module**
>`add CS2113T module-website https://nus-cs2113-ay2021s1.github.io/website/index.html`
>
>![](./images/addSlotCommand/addbookmarktomoduleoutput.PNG)

**Adding a bookmark to a slot**
>`add CS2102 tutorial fri 10:00 12:00 www.google.com`
>
>![](./images/addSlotCommand/addbookmarktoslotoutput.PNG)

**Chaining commands**
>`add CG2271 tutorial thu 11:00 12:00, lecture wed 09:00 11:00 www.yahoo.com, example-bookmark https://www.youtube.com`
>
>![](./images/addSlotCommand/addchaincommandoutput.PNG)
>
>*The indentation of each line of the output shows the relationships between the components.
>In the output shown below, `bookmarks added to CG2271 lecture` is one level of indentation 
>higher than the previous line. This means that the bookmark is added to that lecture slot.
>Similarly, `bookmark added to module` is one level of indentation higher than `CG2271 added`, 
>which suggests that the bookmark is added to the module CG2271.*

**Showing the result**
>`show CG2271 bookmarks`
>
>![](./images/addSlotCommand/addresult.PNG)

More examples:
* `add cs2113t`  
* `add cs2113t lecture fri 16:00 18:00`
* `add cs2113t notes www.google.com`
* `add cs2113t lecture fri 16:00 18:00 www.google.com`
* `add cs2113t 1 www.yahoo.com`
* `add cs2113t lecture fri 16:00 18:00 www.google.com, notes www.google.com, tutorial fri 10:00 12:00`

<br><br>

<a name="deletetimeslot"></a>
#### 3.3.4. Delete module, time slot and bookmarks: `delete` (Xing Rong)
Deletes module, time slot or their bookmarks.

>* You can only delete a module that is listed on the NUSMods website. 
>You can see the [command format](#command_format) for more information.
>* Deleting bookmarks will delete all bookmarks associated with the module or slot.

```
Format (deleting a module): delete {MODULE}

Format (deleting a slot of a module): delete {MODULE} {INDEX} 

Format (deleting bookmarks of a module): delete {MODULE} bookmarks 

Format (deleting bookmarks of a slot of a module): delete {MODULE} {INDEX} bookmarks 
```

Example of usage:   
>* `delete CS2113T` 
>* `delete CG2271 1` 
>* `delete CS2113T bookmarks` 
>* `delete CS2113T 1 bookmarks` 
<!-- @@author -->

<br>

<a name="edittimeslot"></a>
#### 3.3.5. Edit slot's module, title, time: `edit`  (Francisco) 
Edits the module, title or time for a specific slot.

>You can only edit a module that is listed on the NUSMods website. 
>You can see the [command format](#command_format) for more information. 

```
Format (editing the module of a slot): edit module {DAY} {INDEX} {new MODULE}

Format (editing the title of a slot): edit title {DAY} {INDEX} {new TITLE}

Format (editing the time of a slot): edit time {DAY} {INDEX} {DAY} {new START_TIME} {new END_TIME}
```

* Obtain the `DAY` and `INDEX` of the slot to be edited using the `show` command.
* For editing the time of a slot, the first `DAY` parameter is to choose the slot you wish to edit.
The second `DAY` parameter is for the new day of the week you wish to set your slot.

<!-- @@author fchensan -->
> For example, let's say that you have these two slots on Wednesday:
>
> ![](https://raw.githubusercontent.com/fchensan/tp/docs-images/docs/images/editslotcontext.png)
>
> If you want to change the title of the second slot to "tutorial", you can simply type `edit title wed 2 tutorial`.
> You should then see a message as shown below:
>
> ![](https://raw.githubusercontent.com/fchensan/tp/docs-images/docs/images/editslot.png)

More examples:   
* `edit module mon 1 CS1010`  
* `edit title mon 1 lecture`
* `edit time mon 1 fri 10:00 12:00`

<br>

<!-- @@author xingrong123-->
<a name="launchtimeslot"></a>
#### 3.3.6. Launch bookmarks from module, slot: `launch` (Xing Rong)  
Launches the bookmarks of slots or the bookmarks of a module

>You can only launch a module that is listed on the NUSMods website. 
>You can see the [command format](#command_format) for more information.

```
Format (launch module bookmarks): launch {MODULE}

Format (launch slot bookmarks): launch {MODULE} {INDEX}
```

* Obtain the `INDEX` of the slot to be launched using the `show {MODULE}` command.
* `launch {MODULE}` launches the bookmarks tagged to the module itself, for example, the module website
* `launch {MODULE} {INDEX}` launches the bookmarks tagged to the second slot of the module, 
for example, the zoom link for tutorial. 

Example of usage:   
* `launch CS2113`  
* `launch CS2113 2`


<br>
<br>

<!-- @@author jusufnathanael -->

<a name="plannermode"></a>  
### 3.4. Planner Mode (Jusuf)

<a name="loadplanner"></a>  
#### 3.4.1. Load planner: `load`  
Loads all the timetables from the `planner` folder and helps you find some common empty slots.

```
Format: load
```
* You need to copy the different .txt files manually to the planner folder before entering this command.
* This command only displays the common empty time slots between.

You can try to download some timetable samples from [here](https://github.com/AY2021S1-CS2113T-W11-1/tp/tree/master/docs/timetable_samples).

<br>

<a name="addmeeting"></a>  
#### 3.4.2. Add meeting: `add`  
You can add modules, time slots, and bookmarks using this feature.
You can also chain commands when adding multiple slots and bookmarks to a module by using `,` as a separator.

Format: same as [add time slots](#addtimeslot) command.

* You can only add a new meeting to empty time slots.
* Note that this command does not automatically store the newly added meeting to the .txt files. 
* You will need to type `save` to save your changes.

<br>

<a name="showplanner"></a>  
#### 3.4.3. Show planner: `show`
You will be able to see the empty time slots for a certain day or the whole week.

If your selected timetable is the current day, you should be able to see a 
"current time" indicator with your system local time. Else, if you have a lesson ongoing currently,
it will instead show a "lesson now" indicator *around* your current lesson.

```
Format: show {DAY(optional)}
```

* The valid day inputs are `mon`, `tue`, `wed`, `thu`, `fri`, `sat`, `sun`, and `today`. 
* You have to enter `DAY` input according to the command format else it will not be recognised as a valid date. 
* You can see the [command format](#command_format) for more information.

Example of usage:   
* `show`
* `show wed`
* `show today`

>This is the output if you type `show` after initialisation in planner mode:
>
><img src="./images/showplannercommand.PNG" width="400" height="426" />

<br>

<a name="saveplanner"></a>  
#### 3.4.4. Save planner: `save`  
Saves the newly added slot(s) to each individual timetable.
```
Format: save
```

<br>
<br>


<!-- @@author Speedweener -->
<a name="faq"></a>
## 4. FAQ  

**Q** &nbsp; : My Zoomaster logo looks weird! Is there something wrong with my program?   
  
**A** &nbsp; : Some users might encounter a start-up screen that looks like this.

&nbsp; &nbsp; &nbsp; &nbsp; ![](https://raw.githubusercontent.com/AY2021S1-CS2113T-W11-1/tp/master/docs/images/buglogo.png)

&nbsp; &nbsp; &nbsp; &nbsp; This is only a visual bug. Other than the weird-looking logo, Zoomaster will work as per normal. No
need to worry!

<br>
  
**Q** &nbsp; : How do I transfer my data to another computer?   
  
**A** &nbsp; : Simply copy the `data/bookmarks.txt` and `data/slots.txt` file to the **data** directory.<br>
&nbsp; &nbsp; &nbsp; &nbsp; This directory should be in the same location where you have stored the `jar` file.

&nbsp; &nbsp; &nbsp; &nbsp; ![](https://raw.githubusercontent.com/Speedweener/ip/master/docs/images/directory.png)

&nbsp; &nbsp; &nbsp; &nbsp; Start the application and all the data should be loaded.

<br>

**Q** &nbsp; : Can I add a module not from NUS?   
  
**A** &nbsp; : Yes you can! <br>
&nbsp; &nbsp; &nbsp; &nbsp; In the **data** directory locate the  `modulelist.txt` file. Add the new module on a new line
and save the txt file. You can now add the module in Zoomaster.

<br>
<br>

## 5. Command Summary

**Global** 

**Action** | **Format, Examples**
---------- | --------------------
**help** | `help {COMMAND(optional)}` <br> example: `help`, `help add`
**mode** | `mode {bookmark/timetable/planner}`<br> example: `mode bookmark`, `mode timetable`
**clear** | `clear`
**launch now** | `launch now`
**show settings** | `showsettings`
**set a setting** | `set {SETTING_NAME} {NEW_OPTION}`
**exit** | `exit`

**Bookmark Mode**

**Action** | **Format, Examples**
---------- | --------------------
**show** | `show`
**add** | `add {DESCRIPTION} {URL}` <br> example: `add cheatsheet www.google.com`
**delete** | `delete {INDEX}` <br> example: `delete 2`
**edit** | `edit {desc/url} {INDEX} {NEW_VALUE}` <br> example: `edit desc 1 math`, `edit url 3 www.google.com`
**find** | `find {MODULE} {DESCRIPTION(optional)}` <br> example: `find CS2113 tutorial`
**launch** | `launch {MODULE} {DESCRIPTION(optional)}` <br> example: `launch CS2113`


**Timetable Mode**

**Action** | **Format, Examples**
---------- | --------------------
**show (lessons)** | `show {DAY(optional)}` <br> example: `show`, `show wed`, `show today` 
**show (modules/bookmarks)** | `show {MODULE} bookmarks(optional)` <br> example: `show CS2113`, `show CS2113 bookmarks`
**add** | `add {MODULE}` <br> example: `add CS2113T` <br/> `add {MODULE} {DESCRIPTION} {DAY} {START_TIME} {END_TIME}` <br> example: `add CS2113T tutorial wed 11:00 12:00` <br/><br/>`add {MODULE} {DESCRIPTION} {URL}` <br>example: `add CS2113T tutorial www.yahoo.com` <br/><br/> `add {MODULE} {DESCRIPTION} {DAY} {START_TIME} {END_TIME} {URL}` <br>example: `add CS2113T tutorial wed 11:00 12:00 www.yahoo.com` <br/><br/>`add {MODULE} {INDEX} {URL}` <br>example: `add CS2113T 2 www.yahoo.com`
**delete** | `delete {MODULE}` <br>example: `delete CS2113`<br/><br/>`delete {MODULE} {INDEX}` <br>example: `delete CS2113 2`<br/><br/>`delete {MODULE} bookmarks` <br>example: `delete CS2113 bookmarks`<br/><br/>`delete {MODULE} {INDEX} bookmarks` <br>example: `delete CS2113 2 bookmarks`<br/><br/>
**edit** | `edit module {DAY} {INDEX} {new MODULE}` <br> example: `edit module fri 2 CS1010` <br/><br/> `edit title {DAY} {INDEX} {new TITLE}`<br> example: `edit title fri 2 tutorial` <br/><br/>`edit time {DAY} {INDEX} {new START_TIME} {new END_TIME}` <br> example: `edit time fri 2 16:00 18:00`
**launch** |`launch {MODULE}` <br> example: `launch CS2113` <br/><br/> `launch {MODULE} {INDEX}` <br> example: `launch CS2113 1` 


**Planner Mode**

**Action** | **Format, Examples**
---------- | --------------------
**load** | `load`
**show** | `show {DAY(optional)}` <br>example: `show`, `show wed`, `show today` 
**add** | see add in timetable mode above
**save** | `save`
