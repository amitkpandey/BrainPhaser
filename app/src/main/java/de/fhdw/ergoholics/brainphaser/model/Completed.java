package de.fhdw.ergoholics.brainphaser.model;

import de.fhdw.ergoholics.brainphaser.model.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "COMPLETED".
 */
public class Completed {

    private Long id;
    private Integer class;
    private java.util.Date timeLastCompleted;
    private long userId;
    private long challengeId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient CompletedDao myDao;

    private Challenge challengeCompletions;
    private Long challengeCompletions__resolvedKey;


    public Completed() {
    }

    public Completed(Long id) {
        this.id = id;
    }

    public Completed(Long id, Integer class, java.util.Date timeLastCompleted, long userId, long challengeId) {
        this.id = id;
        this.class = class;
        this.timeLastCompleted = timeLastCompleted;
        this.userId = userId;
        this.challengeId = challengeId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getCompletedDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getClass() {
        return class;
    }

    public void setClass(Integer class) {
        this.class = class;
    }

    public java.util.Date getTimeLastCompleted() {
        return timeLastCompleted;
    }

    public void setTimeLastCompleted(java.util.Date timeLastCompleted) {
        this.timeLastCompleted = timeLastCompleted;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getChallengeId() {
        return challengeId;
    }

    public void setChallengeId(long challengeId) {
        this.challengeId = challengeId;
    }

    /** To-one relationship, resolved on first access. */
    public Challenge getChallengeCompletions() {
        long __key = this.challengeId;
        if (challengeCompletions__resolvedKey == null || !challengeCompletions__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ChallengeDao targetDao = daoSession.getChallengeDao();
            Challenge challengeCompletionsNew = targetDao.load(__key);
            synchronized (this) {
                challengeCompletions = challengeCompletionsNew;
            	challengeCompletions__resolvedKey = __key;
            }
        }
        return challengeCompletions;
    }

    public void setChallengeCompletions(Challenge challengeCompletions) {
        if (challengeCompletions == null) {
            throw new DaoException("To-one property 'challengeId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.challengeCompletions = challengeCompletions;
            challengeId = challengeCompletions.getId();
            challengeCompletions__resolvedKey = challengeId;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
