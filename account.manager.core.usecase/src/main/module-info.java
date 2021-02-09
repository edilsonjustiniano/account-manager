module account.manager.core.usecase {
    requires account.manager.core.entity;
    exports account.manager.core.usecases.account;
    exports account.manager.core.usecases.license;
    exports account.manager.core.usecases.ports.account;
    exports account.manager.core.usecases.ports.license;
}