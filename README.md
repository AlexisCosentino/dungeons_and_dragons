HELLO !<br>
Welcome to my dungeon & Dragon Game<br>
<br>
1/  Create a new Character :<br>
    _ You will need to add a new class extends from Character,<br>
    _ Attribute must be of type Weapon or Power depends on you,<br>
    _ Constructor needs as parameters -> name and weapon or power,<br>
    _ the super constructor will need (name, health and strength),<br>
    _ Will also need to abstract method 'getLeftHand', which is a function to equip a weapon or power.<br>
<br>
Then if you really want play with this character, you will need to add in the menu Class, method createChar, an option to chose this new player.<br>
<br><br><br>


2/  Create a new Enemy :<br>
    _ You will need to add a new class extends from Enemies,<br>
    _ Doesn't need attribute,<br>
    _ in constructor, super will need (Name, health and strength).<br>

If you want see this enemy in the game, you will also need to add in the boardList, some new EnemyCase(new YourEnemy).<br>


