package javamqtt;

import java.util.Calendar;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "Sensores")

public class Database {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQUENCE_Sensores")
	@Column(name = "ID", nullable = false)
	private Integer ID;
	private String Data;
	@Column(name = "LUGAR", nullable = false)
	private String Local;
	@Column(name = "SENSOR", nullable = false)
	private String Sensor;
	@Column(name = "TEMPERATURA", nullable = false)
	private String Temperatura;
	@Column(name = "UMIDADE", nullable = true)
	private String Umidade;

	public Database() {
	}

	public Database(Integer iD, String data, Calendar hora, String local, String sensor, String temperatura,
			String umidade) {
		ID = iD;
		Data = data;
		Local = local;
		Sensor = sensor;
		Temperatura = temperatura;
		Umidade = umidade;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

	public String getLocal() {
		return Local;
	}

	public void setLocal(String local) {
		Local = local;
	}

	public String getSensor() {
		return Sensor;
	}

	public void setSensor(String sensor) {
		Sensor = sensor;
	}

	public String getTemperatura() {
		return Temperatura;
	}

	public void setTemperatura(String temperatura) {
		Temperatura = temperatura;
	}

	public String getUmidade() {
		return Umidade;
	}

	public void setUmidade(String umidade) {
		Umidade = umidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Database other = (Database) obj;
		return Objects.equals(ID, other.ID);
	}

	@Override
	public String toString() {
		return "Database [ID=" + ID + ", Data=" + Data + ", Local=" + Local + ", Sensor=" + Sensor + ", Temperatura="
				+ Temperatura + ", Umidade=" + Umidade + "]";
	}

}
