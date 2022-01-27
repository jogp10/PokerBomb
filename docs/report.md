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
#### Implementation:
We implemented the Model, View, Controller design pattern in the vast majority of our code. We have classes which their purpose is to store data (model), classes to represent the interface to the user (view) and
classes 
- **State** - We started implementing the State design pattern for the Menu and Instructions. We will also implement a state which represents that a game is taking place and another that represents that the user is in the store.
- **Factory Method** - We started implementing the Factory Method design pattern for the Cards, we expect to use it along our project more times.


### Factory Method
#### Problem in a Context:
We needed to create various types of cards. Jungle, Frozen, etc. Our first version only handled with Normal Cards, so the code lived inside the Card class.
After a while, we decided to go creative. Our code would get full of conditionals that switch the app's behavior depending on the class objects.

#### The Pattern:
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
#### Implementation:
<p align="center" justify="center">
  <img src="screenshots/FactoryMethod.png" width="660" height="380" title="Mutation Test" alt=""/>
</p>
<p align="center">
  <b><i>Fig 3. Factory Method screenshot</i></b>
</p>

These classes can be found in the following file:
- [Card](../src/main/java/com/pokerbomb/model/game/cards/Card.java)
- [Normal Card](../src/main/java/com/pokerbomb/model/game/cards/CardGeneric.java)
- [Jungle Card](../src/main/java/com/pokerbomb/model/game/cards/JungleCard.java)
- [Dynamite Card](../src/main/java/com/pokerbomb/model/game/cards/DynamiteCard.java)
- [Frozen Card](../src/main/java/com/pokerbomb/model/game/cards/FrozenCard.java)
- [Card Factory](../src/main/java/com/pokerbomb/model/game/cards/CardFactory.java)
- [Normal Card Factory](../src/main/java/com/pokerbomb/model/game/cards/NormalCardFactory.java)
- [Jungle Card Factory](../src/main/java/com/pokerbomb/model/game/cards/JungleCardFactory.java)
- [Dynamite Card Factory](../src/main/java/com/pokerbomb/model/game/cards/DynamiteCardFactory.java)
- [Frozen Card Factory](../src/main/java/com/pokerbomb/model/game/cards/FrozenCardFactory.java)

We also used the same implementation in creation of States for MVC:
- [Controller State](../src/main/java/com/pokerbomb/controller/state/ControllerState.java)
- [Menu State](../src/main/java/com/pokerbomb/controller/state/MenuState.java)
- [Instructions State](../src/main/java/com/pokerbomb/controller/state/InsState.java)
- [Store State](../src/main/java/com/pokerbomb/controller/state/StoreState.java)
- [Select Level State](../src/main/java/com/pokerbomb/controller/state/SelectLevelState.java)
- [Game State](../src/main/java/com/pokerbomb/controller/state/GameState.java)
- [Game Win State](../src/main/java/com/pokerbomb/controller/state/GameWinState.java)
- [Game Over State](../src/main/java/com/pokerbomb/controller/state/GameOverState.java)
- [State Factory](../src/main/java/com/pokerbomb/controller/state/FactoryState.java)

#### Consequences:
- The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.

### Strategy Pattern

#### Problem in a Context:
Aiming for a way to change difficulty of the levels. We generate our decks with probabilities for each special card. This implementation
makes it possible to not only create this two difficulties but in the future implement more without ease.

#### The Pattern:
Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

#### Implementation:
<p align="center" justify="center">
  <img src="screenshots/StrategyPattern.png" width="316" height="298" title="Mutation Test" alt=""/>
</p>
<p align="center">
  <b><i>Fig 4. Strategy Pattern screenshot</i></b>
</p>

These classes can be found in the following file:
- [Deck](../src/main/java/com/pokerbomb/model/game/deck/Deck.java)
- [DeckStrategy](../src/main/java/com/pokerbomb/model/game/deck/DeckStrategy.java)
- [EasyDeckStrategy](../src/main/java/com/pokerbomb/model/game/deck/EasyDeckStrategy.java)
- [HardDeckStrategy](../src/main/java/com/pokerbomb/model/game/deck/HardDeckStrategy.java)

#### Consequences:
- Clients must be aware of the differences between strategies to be able to select a proper one.


## Testing

#### Screenshot of coverage report
<p align="center" justify="center">
  <img src="screenshots/TestsCoverage.png" width="981" height="227" title="Test Coverage" alt=""/>
</p>
<p align="center">
  <b><i>Fig 5. Code coverage screenshot</i></b>
</p>

#### Screenshot of mutation testing report
[Mutation tests](../build/reports/pitest/202201161841/index.html)
<p align="center" justify="center">
  <img src="screenshots/MutationTesting.png" width="664" height="176" title="Mutation Test" alt=""/>
</p>
<p align="center">
  <b><i>Fig 6. Mutation Test screenshot</i></b>
</p>

## Self-evaluation