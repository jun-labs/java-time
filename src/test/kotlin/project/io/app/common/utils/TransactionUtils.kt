package project.io.app.common.utils

import org.hibernate.Session
import org.hibernate.SessionFactory
import org.hibernate.Transaction

object TransactionUtils {

    fun startTransaction(sessionFactory: SessionFactory): Pair<Session, Transaction> {
        val session = sessionFactory.openSession()
        val transaction = session.beginTransaction()
        return Pair(session, transaction)
    }

    fun endTransaction(
        transaction: Transaction,
        session: Session,
        sessionFactory: SessionFactory,
        rollback: Boolean,
    ) {
        if (rollback) {
            transaction.rollback()
            return
        } else {
            transaction.commit()
        }
        session.close()
        sessionFactory.close()
    }
}
