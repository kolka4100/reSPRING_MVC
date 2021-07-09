package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.Dao.CarDao;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(int count) {
        return carDao.listCar();
    }
}
