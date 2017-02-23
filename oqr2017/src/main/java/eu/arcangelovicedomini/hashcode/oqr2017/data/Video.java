package eu.arcangelovicedomini.hashcode.oqr2017.data;

import java.util.List;

public class Video {
	private Long id;
	private Long sizeMb;
	private List<Request> requests;

	public Video(Long id, Long sizeMb) {
		this.id = id;
		this.sizeMb = sizeMb;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSizeMb() {
		return sizeMb;
	}

	public void setSizeMb(Long sizeMb) {
		this.sizeMb = sizeMb;
	}

	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}

}
