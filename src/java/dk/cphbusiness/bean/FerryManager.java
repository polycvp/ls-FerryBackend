/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.bean;

import contract.CustomerContract;
import dto.AbstractAccount;
import dto.AccountDetail;
import dto.AccountSummary;
import dto.ReservationDetail;
import dto.ReservationSummary;
import dto.TrafficDetail;
import dto.TrafficSummary;
import dto.TravelDetail;
import dto.TravelSummary;
import eto.InvalidAccountException;
import eto.InvalidRouteException;
import eto.NoFerriesFoundException;
import eto.NoScheduleException;
import eto.NoSuchAccountException;
import eto.NoSuchReservationException;
import java.util.Collection;
import javax.ejb.Stateless;

/**
 *
 * @author Jon
 */
@Stateless
public class FerryManager implements CustomerContract
{

    @Override
    public Collection<TrafficSummary> getTrafficInformation(TrafficDetail trafficDetail) throws InvalidRouteException, NoFerriesFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TravelSummary getTravelSummary(TravelDetail travelDetail) throws NoScheduleException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ReservationSummary makeReservation(ReservationDetail resDetail) throws NoSuchReservationException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteReservation(int reservationId) throws NoSuchReservationException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ReservationSummary editReservation(ReservationDetail resDetail) throws NoSuchReservationException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isUserResident(AbstractAccount accDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AccountSummary makeAccount(AccountDetail accDetail) throws InvalidAccountException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AccountDetail login(String email, String password) throws NoSuchAccountException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AccountSummary deleteAccount(AccountDetail accDetail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editAccount(AccountDetail accDetail) throws NoSuchAccountException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
