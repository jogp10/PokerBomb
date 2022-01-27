# LDTS_T12_G03 - POKER BOMB

## Game Description

The POKER BOMB is a card-like based game where you have to combine different cards to make poker-hands, completing the requests will give you the chance to level up and retrieve your rewards.
The variety of levels will have increased difficulty with different types of cards and requests.

This project was developed by Afonso Martins (up202005900@up.pt), Joao Pinheiro (up202008133@up.pt) and Alexandre Sa (up201905383@up.pt) for LDTS 2021-22.

## Implemented Features

- **Menus** - The user has the capability of browsing through all the menus of the application (Main Menu, Instructions, Store, Level Selection, Game).
- **Buttons** - Functional and interactive buttons.
- **Keyboard control** - The user can use the keyboard to browse and interact with the options in the menu and to control the in-game commands. Inputs are received through the respective events and interpreted according to the current game state.
- **Shop and money management** - The player may buy new powerups in the store, using the coins earned by playing the game and completing levels.
- **Cards** - Several types of cards to deal with (jungle cards, dynamite cards , frozen cards).
- **Power Ups** - Implementation of power-ups (e.g. Unfreeze cards, add plays to dynamite cards, eliminate layers of jungle cards).
- **Levels** - The player can choose the level to play based on the quests of each one (displayed in the level selection screen).
- **Quests** - To complete a level, the player must complete a set of quests.
- **Cards and combinations logic** - The game can check for combinations of poker hands and determine if  acertain goal was achieved, updating the in-game quests.

## Planned Features (only the ones on this list were not implemented)

- **Multipliers** - Each card combination ( poker hand ) will have a multiplier. The hand-score is obtained by multiplying the base type-hand with the multiplier.
- **Animations** - Several animations are incorporated in this game, like card explosions, win and loss messages or level loading.
- **Seasons** - A season is determined by the number of levels passed and for each new season unlocks upgrades. New power-ups will be added to the game, or a free gift may be given to the player, like a money boost or a free power-up.
- **Build your own level** - We invite you to collaborate with us and make your level from scratch.

## Design Patterns

### MVC

#### Problem in context:
It is important to separate the data, interface and control of the game to have a more code reusability and to make the code more organized and easy to implement.

#### The pattern:
This design pattern is used to separate all the code in three elements(Model, View and Control). The Model does not have dependencies, the View depends on the Model, and the Controller depends on both the Viewer and Model.

#### Implementation:
The main directory of our project is sub-divided into three different directories for each of the pattern's components: Model, View and Controller.
<p align="center" justify="center">
  <img src="screenshots/MVC.png" width="321" height="111" title="MVC" alt=""/>
</p>
<p align="center">
  <b><i>Fig . MVC Pattern</i></b>
</p>

#### Consequences:
- Related actions are grouped together so the code is more organized. 
- The front-end and back-end can be done simultaneously. 
- The program becomes easier to modify because all three elements are separated from each other.


### Singleton

#### Problem in context:
We wanted to make sure that, during the execution of the game, all of the three PowerUps only have a single instance, so that the player can buy them in the store, use them, and the number of powerups will always be updated globally.
The player must also be a single instance, in order to manage its coins and interaction with the game effectively.

#### The pattern:
Just like a global variable, the Singleton pattern grants access to some object from anywhere in the program. However, it also protects that instance from being overwritten by other code.
As our code has access to the Singleton class, it is able to call the Singleton’s static method. So whenever that method is called, the same object is always returned.

#### Implementation:
Our "Player" and "PowerUp" classes both implement the Singleton pattern.
<p align="center" justify="center">
  <img src="screenshots/Singleton.png" width="430" height="144" title="MVC" alt=""/>
</p>
<p align="center">
  <b><i>Fig . Singleton Pattern</i></b>
</p>

These classes can be found in the following files:
- [DynamitePowerUp](../src/main/java/com/pokerbomb/model/game/powerup/DynamitePowerUp.java)
- [FrozenPowerUp](../src/main/java/com/pokerbomb/model/game/powerup/FrozenPowerUp.java)
- [JunglePowerUp](../src/main/java/com/pokerbomb/model/game/powerup/JunglePowerUp.java)
- [Player](../src/main/java/com/pokerbomb/model/Player.java)


#### Consequences:
- We can be sure that the class has only a single instance.
- We gain a global access point to that instance.
- The singleton object is initialized only when it’s requested for the first time.






## Testing

### Screenshot of coverage report
<p align="center" justify="center">
  <img src="screenshots/TestsCoverage.png" width="981" height="227" title="Test Coverage" alt=""/>
</p>
<p align="center">
  <b><i>Fig 6. Code coverage screenshot</i></b>
</p>

### Screenshot of mutation testing report
<p align="center" justify="center">
  <img src="screenshots/MutationTesting.png" width="664" height="176" title="Mutation Test" alt=""/>
</p>
<p align="center">
  <b><i>Fig 6. Mutation Test screenshot</i></b>
</p>

