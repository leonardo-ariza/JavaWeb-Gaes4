/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session_bin;

import Persistencias.FailedJobs;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER
 */
@Stateless
public class FailedJobsFacade extends AbstractFacade<FailedJobs> {

    @PersistenceContext(unitName = "LunesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FailedJobsFacade() {
        super(FailedJobs.class);
    }
    
}
