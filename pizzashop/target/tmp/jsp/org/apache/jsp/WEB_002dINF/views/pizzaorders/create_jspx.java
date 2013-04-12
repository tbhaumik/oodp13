package org.apache.jsp.WEB_002dINF.views.pizzaorders;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(7);
    _jspx_dependants.add("/WEB-INF/tags/form/create.tagx");
    _jspx_dependants.add("/WEB-INF/tags/util/panel.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/input.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/datetime.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/select.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/reference.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/dependency.tagx");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div version=\"2.0\">");
      if (_jspx_meth_form_create_0(_jspx_page_context))
        return;
      if (_jspx_meth_form_dependency_0(_jspx_page_context))
        return;
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_form_create_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:create
    org.apache.jsp.tag.web.form.create_tagx _jspx_th_form_create_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.create_tagx.class) : new org.apache.jsp.tag.web.form.create_tagx();
    _jspx_th_form_create_0.setJspContext(_jspx_page_context);
    _jspx_th_form_create_0.setZ("LUFSTtklRUI/SqNFZALrkKuLYCA=");
    _jspx_th_form_create_0.setRender((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty dependencies}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_create_0.setPath("/pizzaorders");
    _jspx_th_form_create_0.setModelAttribute("pizzaOrder");
    _jspx_th_form_create_0.setId("fc_com_springsource_pizzashop_domain_PizzaOrder");
    _jspx_th_form_create_0.setCompositePkField("id");
    _jspx_th_form_create_0.setJspBody(new create_jspxHelper( 0, _jspx_page_context, _jspx_th_form_create_0, null));
    _jspx_th_form_create_0.doTag();
    return false;
  }

  private boolean _jspx_meth_field_input_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:input
    org.apache.jsp.tag.web.form.fields.input_tagx _jspx_th_field_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.fields.input_tagx.class) : new org.apache.jsp.tag.web.form.fields.input_tagx();
    _jspx_th_field_input_0.setJspContext(_jspx_page_context);
    _jspx_th_field_input_0.setParent(_jspx_parent);
    _jspx_th_field_input_0.setZ("gYaMzJza/LPx2BjeuDM9jqGzO6o=");
    _jspx_th_field_input_0.setId("c_com_springsource_pizzashop_domain_PizzaOrder_id_shopCountry");
    _jspx_th_field_input_0.setField("id.shopCountry");
    _jspx_th_field_input_0.setDisableFormBinding(new Boolean(true));
    _jspx_th_field_input_0.doTag();
    return false;
  }

  private boolean _jspx_meth_field_input_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:input
    org.apache.jsp.tag.web.form.fields.input_tagx _jspx_th_field_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.fields.input_tagx.class) : new org.apache.jsp.tag.web.form.fields.input_tagx();
    _jspx_th_field_input_1.setJspContext(_jspx_page_context);
    _jspx_th_field_input_1.setParent(_jspx_parent);
    _jspx_th_field_input_1.setZ("hKT6TVdS0rW5gXX++lJxqwim2sc=");
    _jspx_th_field_input_1.setId("c_com_springsource_pizzashop_domain_PizzaOrder_id_shopCity");
    _jspx_th_field_input_1.setField("id.shopCity");
    _jspx_th_field_input_1.setDisableFormBinding(new Boolean(true));
    _jspx_th_field_input_1.doTag();
    return false;
  }

  private boolean _jspx_meth_field_input_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:input
    org.apache.jsp.tag.web.form.fields.input_tagx _jspx_th_field_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.fields.input_tagx.class) : new org.apache.jsp.tag.web.form.fields.input_tagx();
    _jspx_th_field_input_2.setJspContext(_jspx_page_context);
    _jspx_th_field_input_2.setParent(_jspx_parent);
    _jspx_th_field_input_2.setZ("jZDuNFtjBLbNeyE7nmwvgltMGuA=");
    _jspx_th_field_input_2.setId("c_com_springsource_pizzashop_domain_PizzaOrder_id_shopName");
    _jspx_th_field_input_2.setField("id.shopName");
    _jspx_th_field_input_2.setDisableFormBinding(new Boolean(true));
    _jspx_th_field_input_2.doTag();
    return false;
  }

  private boolean _jspx_meth_field_input_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:input
    org.apache.jsp.tag.web.form.fields.input_tagx _jspx_th_field_input_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.fields.input_tagx.class) : new org.apache.jsp.tag.web.form.fields.input_tagx();
    _jspx_th_field_input_3.setJspContext(_jspx_page_context);
    _jspx_th_field_input_3.setParent(_jspx_parent);
    _jspx_th_field_input_3.setZ("FzRS03Kj3igOwUK+UGbj8+mRsP8=");
    _jspx_th_field_input_3.setRequired(new Boolean(true));
    _jspx_th_field_input_3.setMin("2");
    _jspx_th_field_input_3.setId("c_com_springsource_pizzashop_domain_PizzaOrder_name");
    _jspx_th_field_input_3.setField("name");
    _jspx_th_field_input_3.doTag();
    return false;
  }

  private boolean _jspx_meth_field_input_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:input
    org.apache.jsp.tag.web.form.fields.input_tagx _jspx_th_field_input_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.fields.input_tagx.class) : new org.apache.jsp.tag.web.form.fields.input_tagx();
    _jspx_th_field_input_4.setJspContext(_jspx_page_context);
    _jspx_th_field_input_4.setParent(_jspx_parent);
    _jspx_th_field_input_4.setZ("bxMpFcTrG0522DJO+XX9a9ig+KI=");
    _jspx_th_field_input_4.setMax("30");
    _jspx_th_field_input_4.setId("c_com_springsource_pizzashop_domain_PizzaOrder_address");
    _jspx_th_field_input_4.setField("address");
    _jspx_th_field_input_4.doTag();
    return false;
  }

  private boolean _jspx_meth_field_input_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:input
    org.apache.jsp.tag.web.form.fields.input_tagx _jspx_th_field_input_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.fields.input_tagx.class) : new org.apache.jsp.tag.web.form.fields.input_tagx();
    _jspx_th_field_input_5.setJspContext(_jspx_page_context);
    _jspx_th_field_input_5.setParent(_jspx_parent);
    _jspx_th_field_input_5.setZ("6oLp6M3w7dAJHJyfZvM7VWQI5iw=");
    _jspx_th_field_input_5.setValidationMessageCode("field_invalid_number");
    _jspx_th_field_input_5.setId("c_com_springsource_pizzashop_domain_PizzaOrder_total");
    _jspx_th_field_input_5.setField("total");
    _jspx_th_field_input_5.doTag();
    return false;
  }

  private boolean _jspx_meth_field_datetime_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:datetime
    org.apache.jsp.tag.web.form.fields.datetime_tagx _jspx_th_field_datetime_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.fields.datetime_tagx.class) : new org.apache.jsp.tag.web.form.fields.datetime_tagx();
    _jspx_th_field_datetime_0.setJspContext(_jspx_page_context);
    _jspx_th_field_datetime_0.setParent(_jspx_parent);
    _jspx_th_field_datetime_0.setZ("wvNNdqzLpR+KpvDhFzJcm2jtW0I=");
    _jspx_th_field_datetime_0.setId("c_com_springsource_pizzashop_domain_PizzaOrder_deliveryDate");
    _jspx_th_field_datetime_0.setField("deliveryDate");
    _jspx_th_field_datetime_0.setDateTimePattern((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pizzaOrder_deliverydate_date_format}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_field_datetime_0.doTag();
    return false;
  }

  private boolean _jspx_meth_field_select_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:select
    org.apache.jsp.tag.web.form.fields.select_tagx _jspx_th_field_select_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.fields.select_tagx.class) : new org.apache.jsp.tag.web.form.fields.select_tagx();
    _jspx_th_field_select_0.setJspContext(_jspx_page_context);
    _jspx_th_field_select_0.setParent(_jspx_parent);
    _jspx_th_field_select_0.setZ("RcB1CRjdKIIbpAyD3Bzbs2UqIYU=");
    _jspx_th_field_select_0.setPath("/pizzas");
    _jspx_th_field_select_0.setMultiple(new Boolean(true));
    _jspx_th_field_select_0.setItems((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pizzas}", java.util.Collection.class, (PageContext)_jspx_page_context, null));
    _jspx_th_field_select_0.setItemValue("id");
    _jspx_th_field_select_0.setId("c_com_springsource_pizzashop_domain_PizzaOrder_pizzas");
    _jspx_th_field_select_0.setField("pizzas");
    _jspx_th_field_select_0.doTag();
    return false;
  }

  private boolean _jspx_meth_form_dependency_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:dependency
    org.apache.jsp.tag.web.form.dependency_tagx _jspx_th_form_dependency_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.dependency_tagx.class) : new org.apache.jsp.tag.web.form.dependency_tagx();
    _jspx_th_form_dependency_0.setJspContext(_jspx_page_context);
    _jspx_th_form_dependency_0.setZ("5qCulmBuDy9thDFpNQlJEdsWLVk=");
    _jspx_th_form_dependency_0.setRender((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty dependencies}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_dependency_0.setId("d_com_springsource_pizzashop_domain_PizzaOrder");
    _jspx_th_form_dependency_0.setDependencies((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dependencies}", java.util.Collection.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_dependency_0.doTag();
    return false;
  }

  private class create_jspxHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public create_jspxHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_field_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_field_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_field_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_field_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_field_input_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_field_input_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_field_datetime_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_field_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
