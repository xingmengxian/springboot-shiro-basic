package cn.ilongfei.springbootbasic.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

@MappedSuperclass
public class OracleBaseEntity<ID> {
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO) //默认是auto
	//protected ID id;

	public ID getId() {
		return null;
	}
/*
	public void setId(ID id) {
		this.id = id;
	}*/
	
	@Override
    public boolean equals(Object obj) {

        if (null == obj) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (!getClass().equals(obj.getClass())) {
            return false;
        }

        OracleBaseEntity that = (OracleBaseEntity) obj;

        return null == this.getId() ? false : this.getId().equals(that.getId());
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {

        int hashCode = 17;

        hashCode += null == getId() ? 0 : getId().hashCode() * 31;

        return hashCode;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
