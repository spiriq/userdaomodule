module ru.sber.userdaomodule {
    requires ru.sber.entitymodule;
    requires ru.sber.daomodule;
    provides ru.sber.daomodule.Dao with ru.sber.userdaomodule.UserDao;
    exports ru.sber.userdaomodule;
}
