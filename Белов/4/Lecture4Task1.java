import game.Scene;

class Lecture4Task1{
	public static void main(String[] args){
		//test2();
		task();
	}
	private static void task(){
		System.out.println("\n=======================================");
		System.out.println("CREATE SCENE");
		Scene.create();
		System.out.println("\n=======================================");
		System.out.println("RUN GAME");
		Scene.run();
		System.out.println("\n=======================================");
		System.out.println("SHOW RESULT");
		Scene.showResult();
	}
}

/* output:
=======================================
CREATE SCENE
Создаю 7 юнитов

-- new unit --
Created Knight "Knight0" located 0 health 31

-- new unit --
Created Robber "Robber1" located 1 health 8

-- new unit --
У нового мага будет 2 страничная книга заклинаний:
MigraineAllMagicians
ChainLightningAllOthers
Created Magician "Magician2" located 2 health 6

-- new unit --
У нового мага будет 3 страничная книга заклинаний:
ChaseAllMonsters
MigraineAllMagicians
MigraineAllMagicians
Created Magician "Magician3" located 3 health 6

-- new unit --
У нового мага будет 1 страничная книга заклинаний:
HealMyself
Created Magician "Magician4" located 5 health 2

-- new unit --
У нового мага будет 2 страничная книга заклинаний:
HealMyself
TouchFireNeighbors
Created Magician "Magician5" located 7 health 2

-- new unit --
Created Monster "Monster6" located 9 health 19

=======================================
RUN GAME

--- game turn 1 --- В живых сейчас 7

-- ▼ Рыцарь Knight0 на поз. 0 --
, громко кричит, но только пугает всех для храбрости

-- ¶ Разбойник Robber1 на поз. 1 --
, Разбойник хитро сражается с Monster6
, решил напасть на Monster6, на поз. 9
, с уроном 17. Здоровье врага было 19, теперь 2
, Разбойник хитро сражается с Monster6
, решил напасть на Monster6, на поз. 9
, с уроном 17. Здоровье врага было 2, теперь -15
Monster6 убит!!!!!!!!!!!!

-- ☻ Маг Magician2 на поз. 2 --
 -- читает заклинание ChainLightningAllOthers
, решил напасть на Knight0, на поз. 0
, Оппппс! Рыцарь от Мага получает только половину урона 0
, с уроном 1. Здоровье врага было 31, теперь 31
, решил напасть на Robber1, на поз. 1
, с уроном 2. Здоровье врага было 8, теперь 6
, решил напасть на Magician3, на поз. 3
, с уроном 1. Здоровье врага было 6, теперь 5
, решил напасть на Magician4, на поз. 5
, с уроном 1. Здоровье врага было 2, теперь 1
, решил напасть на Magician5, на поз. 7
, с уроном 2. Здоровье врага было 2, теперь 0
, решил напасть на Monster6, на поз. 9
, но враг уже мертв ...

-- ☻ Маг Magician3 на поз. 3 --
 -- читает заклинание MigraineAllMagicians
, решил напасть на Magician2, на поз. 2
, с уроном 1. Здоровье врага было 6, теперь 5
, стал МАЗОХИСТОМ
, решил напасть на Magician3, на поз. 3
, с уроном 2. Здоровье врага было 5, теперь 3
, решил напасть на Magician4, на поз. 5
, с уроном 2. Здоровье врага было 1, теперь -1
Magician4 убит!!!!!!!!!!!!
, решил напасть на Magician5, на поз. 7
, с уроном 2. Здоровье врага было 0, теперь -2
Magician5 убит!!!!!!!!!!!!

--- game turn 2 --- В живых сейчас 4

-- ▼ Рыцарь Knight0 на поз. 0 --
, громко кричит, но только пугает всех для храбрости

-- ¶ Разбойник Robber1 на поз. 1 --

-- ☻ Маг Magician2 на поз. 2 --
 -- читает заклинание ChainLightningAllOthers
, решил напасть на Knight0, на поз. 0
, Оппппс! Рыцарь от Мага получает только половину урона 0
, с уроном 1. Здоровье врага было 31, теперь 31
, решил напасть на Robber1, на поз. 1
, с уроном 2. Здоровье врага было 6, теперь 4
, решил напасть на Magician3, на поз. 3
, с уроном 1. Здоровье врага было 3, теперь 2

-- ☻ Маг Magician3 на поз. 3 --
 -- читает заклинание MigraineAllMagicians
, решил напасть на Magician2, на поз. 2
, с уроном 1. Здоровье врага было 5, теперь 4
, стал МАЗОХИСТОМ
, решил напасть на Magician3, на поз. 3
, с уроном 1. Здоровье врага было 2, теперь 1

--- game turn 3 --- В живых сейчас 4

-- ▼ Рыцарь Knight0 на поз. 0 --
, сражается с Magician3
, решил напасть на Magician3, на поз. 3
, с уроном 5. Здоровье врага было 1, теперь -4
Magician3 убит!!!!!!!!!!!!

-- ¶ Разбойник Robber1 на поз. 1 --
, Разбойник хитро сражается с Knight0
, решил напасть на Knight0, на поз. 0
, с уроном 17. Здоровье врага было 31, теперь 14

-- ☻ Маг Magician2 на поз. 2 --
 -- читает заклинание MigraineAllMagicians
, стал МАЗОХИСТОМ
, решил напасть на Magician2, на поз. 2
, с уроном 2. Здоровье врага было 4, теперь 2
, решил напасть на Magician3, на поз. 3
, но враг уже мертв ...

--- game turn 4 --- В живых сейчас 3

-- ▼ Рыцарь Knight0 на поз. 0 --
, сражается с Robber1
, решил напасть на Robber1, на поз. 1
, с уроном 5. Здоровье врага было 4, теперь -1
Robber1 убит!!!!!!!!!!!!

-- ☻ Маг Magician2 на поз. 2 --
 -- читает заклинание ChainLightningAllOthers
, решил напасть на Knight0, на поз. 0
, Оппппс! Рыцарь от Мага получает только половину урона 1
, с уроном 2. Здоровье врага было 14, теперь 13
, решил напасть на Robber1, на поз. 1
, но враг уже мертв ...

--- game turn 5 --- В живых сейчас 2

-- ▼ Рыцарь Knight0 на поз. 0 --
, громко кричит, но только пугает всех для храбрости

-- ☻ Маг Magician2 на поз. 2 --
 -- читает заклинание MigraineAllMagicians
, стал МАЗОХИСТОМ
, решил напасть на Magician2, на поз. 2
, с уроном 1. Здоровье врага было 2, теперь 1

--- game turn 6 --- В живых сейчас 2

-- ▼ Рыцарь Knight0 на поз. 0 --
, громко кричит, но только пугает всех для храбрости

-- ☻ Маг Magician2 на поз. 2 --
 -- читает заклинание ChainLightningAllOthers
, решил напасть на Knight0, на поз. 0
, Оппппс! Рыцарь от Мага получает только половину урона 0
, с уроном 1. Здоровье врага было 13, теперь 13

--- game turn 7 --- В живых сейчас 2

-- ▼ Рыцарь Knight0 на поз. 0 --
, громко кричит, но только пугает всех для храбрости

-- ☻ Маг Magician2 на поз. 2 --
 -- читает заклинание MigraineAllMagicians
, стал МАЗОХИСТОМ
, решил напасть на Magician2, на поз. 2
, с уроном 2. Здоровье врага было 1, теперь -1
Magician2 убит!!!!!!!!!!!!
.
=======================================
SHOW RESULT
Победил Knight0 (тип Knight)
*/
/*
Задание 4. Битвы магов.
Сегодня будем делать игру.

Есть сцена (game.Scene).
На сцену можно добавить до 10 Персонажей (game.Character)
у каждого персонажа есть позиция (от 0 до 9). На которой он стоит.
 На позиции с одинаковым номером может стоять только один персонаж.
В позициях допускаются пропуски, например, на сцене могут быть всего
 два персонажа: на позиции 1 и на позиции 7.

У абстрактного персонажа есть характеристики:



Текущее здоровье: целое число
	Имя
	Если текущее здоровье у монстра стало отрицательным - он удаляется
	 со сцены и на экран выводится текст "<имя персонажа> убит"

Конкретные персонажи бывают двух типов:
Монстры. Могут атаковать любого персонажа, напрямую нанося урон здоровью.
	Количество урона для каждого конкретного монстра одинаковое, но разные
	 экземпляры монстров могут наносить разное количество урона.
	Если монстр атакует любого персонажа, - на экран должен выводится текст
	 "Монстр <имя> атакует <имя, цели> на <количество> единиц урона урона "
	Маги. Могут колдовать заклинания. Заклинания могут делать что угодно
	со сценой и персонажами на ней.
	У каждого мага есть список заклинаний, которые он может использовать,
	 но не больше 3.

Создайте абстрактный класс game.Spell с методом cast - произнесение заклинания
и полем "название заклинания".

Создайте несколько конкретных заклинаний. Например:
Исцеление - добавляет очков здоровья магу, произнесшему заклинания.
Молния - наносит урон любому персонажу.
Цепная молния - наносит урон, всем персонажам на сцене, кроме мага,
 который произносит заклинание.
Стена огня - наносит урон всем персонажам на четных позициях.
Огненное касание - наносит урон персонажу, стоящему на соседней с магом позиции.
Если на соседних позициях персонажей нет - никому урон не наносится.
Изгнание монстров - наносит урон всем монстрам.
Мигрень - наносит урон всем магам.

Если маг произносит любое заклинание то экран обязательно должен выводится
 общий текст для всех заклинаний:
"Маг <имя> читает заклинание <название заклинания>"
дополнительно должен быть выведен текст, зависящий от заклинания.
Например
"Маг <имя> исцелен на <количество добавленных очков здоровья>.
 Теперь у него <текущее количество> здоровья"
"Цепная молния ударяет по <список персонажей>. Каждый получает <количество> урона."

Игра - пошаговая. В каждый ход все персонажи со сцены делают одно действие:
монстр атакует кого-то, а маг читает любое известное ему заклинание.

Порядок, в котором персонажи выполняют действия может быть любым.
Каждый персонаж сам за себя, если на сцене остался только один персонаж -
 то игра завершается и на экран выводится имя и тип (маг, монстр) победившего персонажа.

Создайте сцену со случайным количеством случайных персонажей, запустите игру.

Замечания к заданию:



Задание довольно сложное и, скорее всего, растянется на несколько занятий.
	Обратите внимание, что многие вещи я намеренно не стал детализировать.
	Например, в каких классах располагаются методы, отвечающие за нанесение
	 урона и вывод сообщений на экран, кто управляет сценой и ходами,
	  как происходит генерация начальной сцены, какая книга заклинаний будет
	   у каждого мага, кого атакуют монстры или какое заклинание читает маг и т.п.

	Ваша задача - проанализировать требования и сделать такую структуру классов,
	 которая наиболее гибко будет решать эти требованиях.

	При проектировании структуры классов помните про "правила хорошего программирования":
	- Дублирование кода обычно плохо
	- Код должен быть простым и расширяемым.

	Например, что будет, если в игру добавится новый персонаж с какими-то новыми
	 способностями ( рыцарь, который от всех заклинаний получает только половину
	  урона или разбойник, который имеет некоторый шанс уклониться от атаки монстра)?
*/