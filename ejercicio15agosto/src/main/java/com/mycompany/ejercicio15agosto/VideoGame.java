/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio15agosto;

import java.util.UUID;
import javax.annotation.processing.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
/**
 *
 * @author carlos
 */

@Getter
@Setter

public class VideoGame {
    
    private  final UUID id;
    private  String  title;
    private  int  hoursPlayed ;
    private  boolean  completed;

    public VideoGame(String title, int hoursPlayed, boolean completed) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.hoursPlayed = hoursPlayed;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "VideoGame{" + "title=" + title + ", completed=" + completed + '}';
    }
    
    
    
    
    
}
