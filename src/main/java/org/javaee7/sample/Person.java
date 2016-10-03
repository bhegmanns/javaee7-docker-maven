package org.javaee7.sample;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author arungupta
 */
@XmlRootElement
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Indicates that the current person hasn't got the name.
     * @return true, is the person hasn't got a name
     */
    public boolean hasNoName(){
    	return getName()==null || getName().trim().isEmpty();
    }

    @Override
    public String toString() {
        return name;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
    
    
}