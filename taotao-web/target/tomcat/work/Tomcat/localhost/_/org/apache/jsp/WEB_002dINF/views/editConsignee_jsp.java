/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-11-29 01:15:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editConsignee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- saved from url=(0083)http://trade.jd.com/shopping/dynamic/consignee/editConsignee.action?t=1448456276919 -->\n");
      out.write("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"/mycss/ui-base.css\">\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/jquery-1.6.4.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/base.js\"></script>\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"/mycss/common.css\" source=\"widget\">\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/order.common.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/jquery.checkout.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\" src=\"/myjs/order_consignee.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tfunction confirm(){\n");
      out.write("\t\t\tvar consigneeId=$(\"#consignee_form_id\").val();\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\t   type: \"POST\",\n");
      out.write("\t\t\t\t   url: \"http://www.taotao.com/service/consignee/addConsignee/\"+consigneeId,\n");
      out.write("\t\t\t\t   data: $(\"#confirmSubmit\").serialize(), //表单序列化，将所有的输入内容转化成K/V数据格式\n");
      out.write("\t\t\t\t   statusCode : {\n");
      out.write("\t\t\t\t\t   200 : function(){\n");
      out.write("\t\t\t\t\t\t   window.parent.location.reload();\n");
      out.write("\t\t\t\t\t\t   //$.messager.alert('提示','新增商品成功!');\n");
      out.write("\t\t\t\t\t   },\n");
      out.write("\t\t\t\t\t   500 : function(){\n");
      out.write("\t\t\t\t\t\t   $.messager.alert('提示','新增收货人失败!');\n");
      out.write("\t\t\t\t\t   }\n");
      out.write("\t\t\t\t   }\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("body{ background:#EEEEEE;margin:0; padding:0; font-family:\"微软雅黑\", Arial, Helvetica, sans-serif; }\n");
      out.write("a{ color:#006600; text-decoration:none;}\n");
      out.write("a:hover{color:#990000;}\n");
      out.write(".top{ margin:5px auto; color:#990000; text-align:center;}\n");
      out.write(".info select{ border:1px #993300 solid; background:#FFFFFF;}\n");
      out.write(".info{ margin:5px; text-align:center;}\n");
      out.write(".info #show{ color:#3399FF; }\n");
      out.write(".bottom{ text-align:right; font-size:12px; color:#CCCCCC; width:1000px;}\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var Gid  = document.getElementById ;\n");
      out.write("var showArea = function(){\n");
      out.write("\tGid('show').innerHTML = \"<h3>省\" + Gid('s_province').value + \" - 市\" + \t\n");
      out.write("\tGid('s_city').value + \" - 县/区\" + \n");
      out.write("\tGid('s_county').value + \"</h3>\"\n");
      out.write("\t\t\t\t\t\t\t};\n");
      out.write("Gid('s_county').setAttribute('onchange','showArea()');\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\" src=\"/myjs/area.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body marginwidth=\"0\" marginheight=\"0\">\n");
      out.write("<script>if(0==1)parent.goOrder();</script>\n");
      out.write("\n");
      out.write("<form  method=\"post\" id=\"confirmSubmit\">\n");
      out.write("<input type=\"hidden\" id=\"hidden_consignee_townName_\" name=\"townName\" value=\"empty\">\n");
      out.write("  <input type=\"hidden\" id=\"hidden_consignee_provinceId_\" name=\"provinceId\" value=\"0\">\n");
      out.write("  <input type=\"hidden\" id=\"hidden_consignee_cityId_\" name=\"cityId\" value=\"0\">\n");
      out.write("  <input type=\"hidden\" id=\"hidden_consignee_countyId_\" name=\"countryId\" value=\"0\">\n");
      out.write("  <input type=\"hidden\" id=\"hidden_consignee_townId_\" name=\"townId\" value=\"0\">\n");
      out.write("  <input type=\"hidden\" id=\"isUpdateCommonAddress\" name=\"isUpdateCommonAddress\" value=\"0\">\n");
      out.write("<div class=\"form\" id=\"consignee-form\" name=\"consignee-form\">\n");
      out.write("\t<div class=\"item\" id=\"name_div\">\n");
      out.write("\t\t<span class=\"label\"><span style=\"color:red\">*</span>&nbsp;收货人：</span>\n");
      out.write("\t\t<div class=\"fl\">\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("<input type=\"hidden\" id=\"consignee_type\" name=\"type\" value=\"0\">\n");
      out.write("\t\t    <input type=\"hidden\" id=\"consignee_ceshi1\" name=\"consignee_ceshi1\" value=\"\">\n");
      out.write("\t\t\t<input type=\"text\" class=\"itxt\" id=\"consignee_name\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${consignee.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"20\"  tabindex=\"1\">\n");
      out.write("\t\t\t<span class=\"error-msg\" id=\"name_div_error\"></span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\t\t<!-- yanwenqi  全球购添加身份证idCard-->\n");
      out.write("\t\t\t\t<!-- end -->\n");
      out.write("\t<div class=\"item\" id=\"area_div\">\n");
      out.write("\t\t<span class=\"label\"><span style=\"color:red\">*</span>&nbsp;所在地区：</span>\n");
      out.write("\t\t<!-- <div class=\"fl\">\n");
      out.write("\t\t\t<span id=\"span_area\">\n");
      out.write("\t\t\t  <span id=\"span_province\"><select class=\"selt\" id=\"consignee_province\" name=\"consigneeParam.provinceId\" onchange=\"loadCitys()\" tabindex=\"2\"><option value=\"\">请选择：</option><option value=\"1\">北京</option><option value=\"2\">上海</option><option value=\"3\">天津</option><option value=\"4\">重庆</option><option value=\"5\">河北</option><option value=\"6\">山西</option><option value=\"7\">河南</option><option value=\"8\">辽宁</option><option value=\"9\">吉林</option><option value=\"10\">黑龙江</option><option value=\"11\">内蒙古</option><option value=\"12\">江苏</option><option value=\"13\">山东</option><option value=\"14\">安徽</option><option value=\"15\">浙江</option><option value=\"16\">福建</option><option value=\"17\">湖北</option><option value=\"18\">湖南</option><option value=\"19\">广东</option><option value=\"20\">广西</option><option value=\"21\">江西</option><option value=\"22\">四川</option><option value=\"23\">海南</option><option value=\"24\">贵州</option><option value=\"25\">云南</option><option value=\"26\">西藏</option><option value=\"27\">陕西</option><option value=\"28\">甘肃</option><option value=\"29\">青海</option><option value=\"30\">宁夏</option><option value=\"31\">新疆</option><option value=\"32\">台湾</option><option value=\"42\">香港</option><option value=\"43\">澳门</option><option value=\"84\">钓鱼岛</option></select></span>\n");
      out.write("\t\t\t   <span id=\"span_city\"><select class=\"selt\" id=\"consignee_city\" name=\"consigneeParam.cityId\" tabindex=\"3\"><option value=\"\">请选择：</option></select></span>\n");
      out.write("\t\t\t   <span id=\"span_county\"><select class=\"selt\" id=\"consignee_county\" name=\"consigneeParam.countyId\" tabindex=\"4\"><option value=\"\">请选择：</option></select></span>\n");
      out.write("\t\t\t   <span id=\"span_town\" style=\"display:none\"><select class=\"selt\" id=\"consignee_town\" name=\"consigneeParam.townId\" tabindex=\"5\"><option value=\"\">请选择：</option></select></span>\n");
      out.write("\t        </span>\n");
      out.write("\t\t\t<span class=\"error-msg\" id=\"area_div_error\"></span>\n");
      out.write("\t\t\tdiv class=\"ftx-03\">标“*”的为支持货到付款的地区，<a href=\"\" target=\"_Blank\" class=\"ftx-05\" id=\"codHelpUrl\">查看货到付款地区</a></div\n");
      out.write("\t\t</div> -->\n");
      out.write("\t\t<div class=\"fl\">\n");
      out.write("\t\t<span id=\"span_area\">\n");
      out.write("\t <span id=\"span_province\"><select class=\"selt\" id=\"s_province\" name=\"provinceName\"></select></span>  \n");
      out.write("     <span id=\"span_city\"><select class=\"selt\" id=\"s_city\" name=\"cityName\"></select> </span> \n");
      out.write("   <span id=\"span_county\"><select class=\"selt\" id=\"s_county\" name=\"countryName\"></select></span>\n");
      out.write("   <script class=\"resources library\" src=\"area.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script type=\"text/javascript\">_init_area();</script>\n");
      out.write("    <span id=\"show\"></span>\n");
      out.write("      </span>\n");
      out.write("</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"item\">\n");
      out.write("\t\t<span class=\"label\" id=\"address_div\"><span style=\"color:red\">*</span>&nbsp;详细地址：</span>\n");
      out.write("\t\t<div class=\"fl\">\n");
      out.write("\t\t\t<!--span id=\"areaNameTxt\"></span-->\n");
      out.write("\t\t\t<input type=\"text\" class=\"itxt itxt02\" id=\"consignee_address\" name=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${consignee.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"50\" onblur=\"check_Consignee(&#39;address_div&#39;)\" value=\"\" tabindex=\"6\">\n");
      out.write("\t\t\t<span class=\"error-msg\" id=\"address_div_error\"></span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"item\" id=\"call_div\">\n");
      out.write("\t\t<span class=\"label\"><span style=\"color:red\">*</span>&nbsp;手机号码：</span>\n");
      out.write("\t\t<div class=\"fl\">\n");
      out.write("\t\t\t<input type=\"text\" class=\"itxt \" id=\"consignee_mobile\" name=\"mobile\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${consignee.mobile}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" onblur=\"check_Consignee(&#39;call_mobile_div&#39;)\" onfocus=\"if(value == defaultValue){value=&#39;&#39;;}\" maxlength=\"11\" value=\"\" tabindex=\"7\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"fl\">\n");
      out.write("\t\t\t<span class=\"label\">固定电话：</span>\n");
      out.write("\t\t\t<input type=\"text\" class=\"itxt \" id=\"consignee_phone\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${consignee.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" onblur=\"check_Consignee(&#39;call_phone_div&#39;)\" onfocus=\"if(value == defaultValue){value=&#39;&#39;;}\" maxlength=\"20\" value=\"\" tabindex=\"8\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<span class=\"error-msg\" id=\"call_div_error\"></span>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"item\" id=\"email_div\">\n");
      out.write("\t\t<span class=\"label\">邮箱：</span>\n");
      out.write("\t\t<div class=\"fl\">\n");
      out.write("\t\t\t<input type=\"text\" class=\"itxt\" id=\"consignee_email\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${consignee.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"50\" onblur=\"check_Consignee(&#39;email_div&#39;)\" value=\"\" onfocus=\"if(value == defaultValue){value=&#39;&#39;;}\" tabindex=\"9\">\n");
      out.write("\t\t\t<span class=\"error-msg\" id=\"email_div_error\"></span>\n");
      out.write("\t\t\t<div class=\"ftx-03\">用来接收订单提醒邮件，便于您及时了解订单状态</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"item\">\n");
      out.write("\t\t<span class=\"label\">&nbsp;</span>\n");
      out.write("\t\t<div class=\"fl\">\n");
      out.write("\t\t\t<!-- <a href=\"javascript:void(0);\" class=\"btn-9\" onclick=\"save_Consignee()\"><span id=\"saveConsigneeTitleDiv\">保存收货人信息</span></a> -->\n");
      out.write("\t\t\t<input  type=\"button\" value=\"保存收货人信息\" onclick=\"confirm();\"/>\n");
      out.write("\t\t\t<div class=\"loading loading-1\" style=\"display:none\"><b></b>正在提交信息，请等待！</div>\n");
      out.write("\t\t\t<!--a href=\"#none\" class=\"btn-9 ml10\">取消</a-->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"display:none\"><input id=\"consignee_form_reset\" name=\"\" type=\"reset\"></div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\t<!--yanwenqi 全球购添加身份证号下面-->\n");
      out.write("\t\t\t<!--end-->\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("<span id=\"addNumLimitNote\" class=\"status error\" style=\"display:none\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 当前地址数量已达上限，若要继续添加新地址，请先删除部分收货地址。</span>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(\"#consignee_name\").focus();\n");
      out.write("if(-1==-1) loadProvinces(); else show_ConsigneeDetail(-1);\n");
      out.write("$(\"#consignee_name\").focus();\n");
      out.write("</script>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</body></html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/views/editConsignee.jsp(69,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${consignee.id > 0}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<input type=\"hidden\" id=\"consignee_form_id\" name=\"id\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${consignee.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<input type=\"hidden\" id=\"consignee_form_id\" name=\"id\" value=\"0\">\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}
