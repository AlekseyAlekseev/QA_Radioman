package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {


    private int countRadioStation = 10;
    private int currentVolume;
    private int currentRadioStation;

    public Radio(int countRadioStation) {
        this.countRadioStation = countRadioStation;
    }


    public void setStation(int station) {
        if (station < 0 || station > countRadioStation) {
            return;
        }
        if (station < countRadioStation) {
            currentRadioStation = station;
        }
    }

    public void nextStation() {
        if (currentRadioStation < countRadioStation--) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = countRadioStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > countRadioStation--) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

}
