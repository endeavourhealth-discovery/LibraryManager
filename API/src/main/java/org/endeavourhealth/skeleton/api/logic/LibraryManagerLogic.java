package org.endeavourhealth.skeleton.api.logic;

import org.endeavourhealth.skeleton.api.dal.TemplateDAL;
import org.endeavourhealth.skeleton.api.dal.TemplateDAL_JDBC;

public class LibraryManagerLogic {
    private TemplateDAL dal;

    public LibraryManagerLogic() {
        this.dal = new TemplateDAL_JDBC();
    }

    public LibraryManagerLogic(TemplateDAL dal) {
        this.dal = dal;
    }

    public String getMessage(String name) {
        return dal.getGreeting() + " " + name;
    }
}
