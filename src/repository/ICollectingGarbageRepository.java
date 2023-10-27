/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.GarbageStation;
import model.GarbageTruck;

/**
 *
 * @author huypd
 */
public interface ICollectingGarbageRepository {
    void getInput(GarbageTruck g);
    void printTheCost(GarbageTruck g);
}
