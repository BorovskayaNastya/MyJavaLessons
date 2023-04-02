package homeWork4;

import java.util.Objects;

public class  Family  {
    Human mother;
    Human father;
    Human[] children;
    Pet pet;

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "mother = " + mother +
                ", father = " + father +
                ", pet = " + pet +
                ", children = " + children;
    }
    public Family (Human mother, Human father){
        this.children = new Human[0];

    }

    public Family (Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family (Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }
    public Family(){
    }
    public void addChild(Human child) {
        if (children == null) {
            children = new Human[1];
            children[0] = child;
        } else {
            Human[] newChildren = new Human[children.length + 1];
            System.arraycopy(children, 0, newChildren, 0, children.length);
            newChildren[newChildren.length - 1] = child;
            child.setFamily(this);
            children = newChildren;
        }
    }

    public boolean deleteChild(Human child) {
        int childIndex = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                childIndex = i;
                break;
            }
        }
        if (childIndex == -1) {
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, k = 0; i < children.length; i++) {
            if (i != childIndex) {
                newChildren[k++] = children[i];
            }
        }
        children = newChildren;
        child.setFamily(null);
        return true;
    }

    public int countFamily() {
        return children.length + 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Family family = (Family) obj;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father);
    }

    @Override
    protected void finalize () {
        System.out.println("УВАГА! Видалення об'єкту - " + this);
    }
}

