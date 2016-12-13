package hibernate;
// Generated 2016-12-13 10:58:38 by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ResMarkId generated by hbm2java
 */
@Embeddable
public class ResMarkId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int mresId;
	private int markerId;

	public ResMarkId() {
	}

	public ResMarkId(int mresId, int markerId) {
		this.mresId = mresId;
		this.markerId = markerId;
	}

	@Column(name = "mres_id", nullable = false)
	public int getMresId() {
		return this.mresId;
	}

	public void setMresId(int mresId) {
		this.mresId = mresId;
	}

	@Column(name = "marker_id", nullable = false)
	public int getMarkerId() {
		return this.markerId;
	}

	public void setMarkerId(int markerId) {
		this.markerId = markerId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ResMarkId))
			return false;
		ResMarkId castOther = (ResMarkId) other;

		return (this.getMresId() == castOther.getMresId()) && (this.getMarkerId() == castOther.getMarkerId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getMresId();
		result = 37 * result + this.getMarkerId();
		return result;
	}

}