package at.irian.jsfatwork.gui.page.config;

import at.irian.jsfatwork.gui.page.AddCustomerBean;
import org.apache.myfaces.extensions.cdi.core.api.config.view.ViewConfig;
import org.apache.myfaces.extensions.cdi.jsf.api.config.view.Page;
import org.apache.myfaces.extensions.cdi.jsf.api.config.view.PageBean;

@PageBean(AddCustomerBean.class)
@Page(basePath = "")
public abstract class AddCustomerWizard implements ViewConfig {

    @Page
    public final class AddCustomer1 extends AddCustomerWizard {
    }

    @Page
    public final class AddCustomer2 extends AddCustomerWizard {
    }

}
