package sandbox.v3211

import grails.transaction.Transactional

@Transactional
class UserService {

    User getFirstUser() {
        User.first()
    }
}
