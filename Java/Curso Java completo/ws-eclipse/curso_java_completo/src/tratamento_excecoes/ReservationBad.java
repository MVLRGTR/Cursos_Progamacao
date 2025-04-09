package tratamento_excecoes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class ReservationBad {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ReservationBad() {
		
	}
	
	public ReservationBad(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		long diff = getCheckOut().getTime() - checkIn.getTime(); //CONVERTO EM MILLISEGUNDOS AS DATAS
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);       //CONVERTO EM DIAS OS MILLISEGUNDOS
	}
	
	public String updateDates(Date checkIn , Date checkOut) {
		Date now = new Date();
		if (checkIn.before(now)||checkOut.before(now)) {
			return "Reservation dates for update must be future dates";
		}
		if(!checkOut.after(checkIn)) {
			return "Check-out date must be after check-in date";
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null;
	}
	
	public String toString() {
		return "Reservation : Room " + roomNumber + ", check-in: "+ sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut)+ ", "+this.duration()+" nights"; 
	}

}
