/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session_bin;

import Persistencias.PasswordResetTokens;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER
 */
@Stateless
public class PasswordResetTokensFacade extends AbstractFacade<PasswordResetTokens> {

    @PersistenceContext(unitName = "LunesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PasswordResetTokensFacade() {
        super(PasswordResetTokens.class);
    }
    
}
