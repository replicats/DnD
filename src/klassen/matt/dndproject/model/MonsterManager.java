package klassen.matt.dndproject.model;

import klassen.matt.dndproject.model.creature.Monster;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Represents a collection of Monsters
 */
public class MonsterManager implements Iterable<Monster> {

    private static MonsterManager instance;
    private List<Monster> monsters;

    private MonsterManager() {
        monsters = new ArrayList<Monster>();
    }

    public static MonsterManager getInstance() {
        if (instance == null) {
            instance = new MonsterManager();
        }
        return instance;
    }

    public void addMonster(Monster monster) {
        monsters.add(monster);
    }

    public void removeMonster(Monster monster) {
        monsters.remove(monster);
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public boolean hasMonster(Monster monster) {
        return monsters.contains(monster);
    }

    public boolean hasAllMonsters(Set<Monster> monsterSet) {
        return monsters.containsAll(monsterSet);
    }

    @Override
    public Iterator<Monster> iterator() {
        return monsters.iterator();
    }
}