/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.CollectingGarbageDao;
import java.util.ArrayList;
import model.GarbageStation;
import model.GarbageTruck;

/**
 *
 * @author huypd
 */
public class CollectingGarbageRepository implements ICollectingGarbageRepository{

    @Override
    public void getInput(GarbageTruck g) {
        CollectingGarbageDao.Instance().getInput(g);
    }

    @Override
    public void printTheCost(GarbageTruck g) {
        CollectingGarbageDao.Instance().printTheCost(g);
    }
    
}
