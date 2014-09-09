package com.tencent.mm.ui.contact;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.c.a.fx;
import com.tencent.mm.f;
import com.tencent.mm.g.a;
import com.tencent.mm.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.c;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.AlphabetScrollBar;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.base.fy;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.cu;
import com.tencent.mm.ui.voicesearch.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class SelectContactUI extends MMActivity
  implements m
{
  private String cLi;
  private ProgressDialog dWT = null;
  private boolean ekQ = false;
  private ProgressDialog esI;
  com.tencent.mm.pluginsdk.ui.e eue = new com.tencent.mm.pluginsdk.ui.e(new en(this));
  private String ezB;
  private ListView feW;
  private fy fqC = new eq(this);
  private AlphabetScrollBar fqz;
  private boolean fsF = false;
  private LabelContainerView glo;
  private ProgressBar glp;
  private TextView glq;
  private MMTagPanel glr;
  private boolean gls = false;
  private List glt = new ArrayList();
  private boolean glu = true;
  private cn hos;
  private TextView iOn;
  private String jBA;
  private String jBB;
  private boolean jBC = false;
  private fx jBD = null;
  private View jBE = null;
  private View jBF = null;
  private boolean jBG = true;
  private View jBH;
  private View jBI;
  private MultiSelectContactView jBJ;
  private String jBK = "";
  private boolean jBL = true;
  private boolean jBM = false;
  private boolean jBN = false;
  private boolean jBO = false;
  private boolean jBP = false;
  private boolean jBQ = false;
  private String jBR = "";
  private boolean jBS = false;
  private boolean jBT = false;
  private boolean jBU = false;
  private com.tencent.mm.pluginsdk.c.b jBV = new dv(this);
  public int jBW = fl.jCd;
  private dp jBr;
  private String jBs;
  private String jBt;
  private String jBu;
  private String jBv;
  private String jBw;
  private boolean jBx = false;
  private boolean jBy = false;
  private boolean jBz = false;
  private String jwY;
  private j jxB;
  private int jxE;
  private boolean jxG = false;
  private boolean jxH = false;
  private String jxa;
  private boolean jxl = false;

  private static List A(List paramList)
  {
    LinkedList localLinkedList = new LinkedList();
    if (!bg.oE())
      return localLinkedList;
    if (paramList == null)
      return localLinkedList;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      com.tencent.mm.storage.i locali = bg.qW().oT().ys(str);
      if ((locali != null) && ((int)locali.dhv != 0))
        str = locali.od();
      localLinkedList.add(str);
    }
    return localLinkedList;
  }

  private void CG(String paramString)
  {
    boolean bool = getIntent().getBooleanExtra("Need_Result", false);
    Intent localIntent = new Intent();
    if (bool)
    {
      localIntent.putExtra("Select_Conv_User", paramString);
      setResult(-1, localIntent);
    }
    while (true)
    {
      finish();
      return;
      localIntent.setClass(this, ChattingUI.class);
      localIntent.putExtra("Chat_User", paramString);
      localIntent.addFlags(67108864);
      startActivity(localIntent);
    }
  }

  private void VC()
  {
    if (this.jBr != null)
      this.jBr.a(null, null);
    if (this.jxB != null)
      this.jxB.a(null, null);
  }

  private void aWO()
  {
    LinkedList localLinkedList = new LinkedList();
    String str = this.jBu;
    Object localObject = null;
    if (str != null)
    {
      boolean bool2 = this.jBu.equals("");
      localObject = null;
      if (!bool2)
        localObject = ap.b(this.jBu.split(","));
    }
    if ((localObject != null) && (((List)localObject).size() != 0))
      if ((this.jxE == 0) || (this.jxE == 1) || (this.jxE == 5) || (this.jxE == 7) || (this.jxE == 12) || (this.jxE == 9))
      {
        this.jBr.bg((List)localObject);
        switch (this.jxE)
        {
        case 6:
        case 7:
        case 8:
        case 9:
        case 12:
        default:
        case 0:
        case 1:
        case 3:
        case 10:
        case 4:
        case 5:
        case 13:
        case 2:
        case 11:
        }
      }
    while (true)
    {
      if (!((List)localObject).contains("officialaccounts"))
        ((List)localObject).add("officialaccounts");
      ((List)localObject).add("helper_entry");
      if ("@t.qq.com".equals(this.jwY))
        ((List)localObject).add("weixin");
      if (this.jBr != null)
        this.jBr.bc((List)localObject);
      if (this.jxB != null)
        this.jxB.bc(localLinkedList);
      if ((this.jxE == 3) || (this.jxE == 0) || (this.jxE == 1) || (this.jxE == 5))
      {
        if (this.jBJ.aAj() != 0)
          break label860;
        C(1, getString(n.btQ));
      }
      return;
      if ((this.jxE == 3) || (this.jxE != 4))
        break;
      break;
      localObject = new LinkedList();
      break;
      ((List)localObject).add("helper_entry");
      ((List)localObject).add("officialaccounts");
      ((List)localObject).add("filehelper");
      if (!((List)localObject).contains("helper_entry"))
        ((List)localObject).add("helper_entry");
      localLinkedList.addAll((Collection)localObject);
      continue;
      ((List)localObject).add("helper_entry");
      ((List)localObject).add("officialaccounts");
      String[] arrayOfString2 = y.dko;
      int k = arrayOfString2.length;
      for (int m = 0; m < k; m++)
        ((List)localObject).add(arrayOfString2[m]);
      localLinkedList.addAll((Collection)localObject);
      continue;
      ((List)localObject).add("helper_entry");
      ((List)localObject).add("officialaccounts");
      String[] arrayOfString1 = y.dko;
      int i = arrayOfString1.length;
      for (int j = 0; j < i; j++)
        ((List)localObject).add(arrayOfString1[j]);
      localLinkedList.addAll((Collection)localObject);
      continue;
      localLinkedList.addAll((Collection)localObject);
      continue;
      ((List)localObject).add("weixin");
      ((List)localObject).add("weibo");
      ((List)localObject).add("qqmail");
      ((List)localObject).add("fmessage");
      ((List)localObject).add("tmessage");
      ((List)localObject).add("qmessage");
      ((List)localObject).add("qqsync");
      ((List)localObject).add("floatbottle");
      ((List)localObject).add("lbsapp");
      ((List)localObject).add("shakeapp");
      ((List)localObject).add("medianote");
      ((List)localObject).add("qqfriend");
      ((List)localObject).add("readerapp");
      ((List)localObject).add("newsapp");
      ((List)localObject).add("blogapp");
      ((List)localObject).add("facebookapp");
      ((List)localObject).add("masssendapp");
      ((List)localObject).add("meishiapp");
      ((List)localObject).add("feedsapp");
      ((List)localObject).add("voipapp");
      ((List)localObject).add("filehelper");
      ((List)localObject).add("officialaccounts");
      ((List)localObject).add("helper_entry");
      ((List)localObject).add("pc_share");
      ((List)localObject).add("cardpackage");
      ((List)localObject).add("voicevoipapp");
      ((List)localObject).add("voiceinputapp");
      ((List)localObject).add("linkedinplugin");
    }
    label860: C(1, getString(n.btQ) + "(" + this.jBJ.aAj() + ")");
    if (this.jBJ.aAj() > 0);
    for (boolean bool1 = true; ; bool1 = false)
    {
      t(1, bool1);
      return;
    }
  }

  private void bI(String paramString1, String paramString2)
  {
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(paramString2);
    l(paramString1, localLinkedList);
  }

  private void bJ(String paramString1, String paramString2)
  {
    Intent localIntent = new Intent();
    if (paramString1 != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("cardNameToSend is null", bool);
      localIntent.putExtra("be_send_card_name", paramString1);
      localIntent.putExtra("received_card_name", paramString2);
      localIntent.putExtra("Is_Chatroom", true);
      setResult(-1, localIntent);
      finish();
      return;
    }
  }

  private void l(String paramString, List paramList)
  {
    Intent localIntent;
    if (paramList.size() > 0)
    {
      localIntent = new Intent();
      if (this.jBA == null)
        break label79;
    }
    label79: for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("cardNameToSend is null", bool);
      localIntent.putExtra("be_send_card_name", paramString);
      localIntent.putExtra("received_card_name", ap.a(paramList, ","));
      localIntent.putExtra("Is_Chatroom", false);
      setResult(-1, localIntent);
      finish();
      return;
    }
  }

  private void y(int paramInt, boolean paramBoolean)
  {
    com.tencent.mm.ab.k localk = new com.tencent.mm.ab.k(paramInt);
    new cm().post(new er(this, localk));
    if (paramBoolean)
    {
      getString(n.buo);
      this.dWT = com.tencent.mm.ui.base.e.a(this, getString(n.btG), true, new et(this, localk));
    }
  }

  protected final void DP()
  {
    int i = 1;
    if (this.feW != null)
    {
      if (this.jBE != null)
        this.feW.removeHeaderView(this.jBE);
      if (this.jBF != null)
        this.feW.removeHeaderView(this.jBF);
    }
    this.feW = ((ListView)findViewById(com.tencent.mm.i.aeA));
    this.iOn = ((TextView)findViewById(com.tencent.mm.i.arK));
    this.iOn.setText(n.bsf);
    this.jBH = findViewById(com.tencent.mm.i.aPq);
    label318: label1106: ei localei;
    label790: label827: int i2;
    if (!this.glu)
    {
      z.i("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "cpan[initLabel] need no init contact label.");
      this.jBJ = ((MultiSelectContactView)findViewById(com.tencent.mm.i.aeH));
      this.jBJ.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, -2147483648), View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().heightPixels, -2147483648));
      this.jBI = new View(aPI());
      AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, this.jBJ.getMeasuredHeight());
      this.jBI.setLayoutParams(localLayoutParams);
      this.jBI.setVisibility(4);
      this.feW.addHeaderView(this.jBI);
      this.jBJ.a(new ek(this));
      this.jBJ.a(new el(this));
      this.jBJ.a(new em(this));
      this.jBr = new dp(this, this.jwY, this.jxa, this.jxE, this.jxl);
      dp localdp = this.jBr;
      if ((this.jxE == 0) && (this.jBO))
        break label1597;
      int j = i;
      localdp.fC(j);
      aWO();
      ArrayList localArrayList = getIntent().getStringArrayListExtra("custom_user_list");
      this.jBr.bf(localArrayList);
      this.jBr.fE(getIntent().getBooleanExtra("show_recent_contact", false));
      this.jBr.CA(getIntent().getStringExtra("recent_contact_tag_filter"));
      this.jBr.fD(getIntent().getBooleanExtra("show_fav_contact", i));
      this.jBr.Cz(getIntent().getStringExtra("custom_user_catalog_name"));
      this.jBr.a(new eh(this));
      if ((this.jBz) && (this.jBw != null) && (!"".equals(this.jBw.trim())))
      {
        String[] arrayOfString = this.jBw.split(",");
        Object[] arrayOfObject2 = new Object[i];
        arrayOfObject2[0] = Arrays.toString(arrayOfString);
        z.d("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "chatroom members name=[%s]", arrayOfObject2);
        this.jBr.b("", arrayOfString, i);
      }
      this.jxB = new j(aPI(), i);
      this.jxB.gn(i);
      if (((this.jxE == 0) || (this.jxE == i) || (this.jxE == 3) || (this.jxE == 5) || (this.jxE == 12) || (this.jxE == 10) || (this.jxE == 11)) && ((this.jxE != 0) || (!this.jBO)))
        this.jxH = i;
      z.d("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "listType is " + this.jxE);
      if ("@biz.contact".equals(this.jwY))
        a(new es(this));
      if (this.jxE != 0)
        break label1603;
      if (this.jBG)
      {
        this.jBE = View.inflate(this, com.tencent.mm.k.bgz, null);
        this.jBE.setOnClickListener(new fe(this));
        this.feW.addHeaderView(this.jBE);
      }
      if (this.jBT)
      {
        this.jBF = View.inflate(this, com.tencent.mm.k.bgz, null);
        this.jBF.setOnClickListener(new fg(this));
        TextView localTextView = (TextView)this.jBF.findViewById(com.tencent.mm.i.akC);
        if (localTextView != null)
          localTextView.setText(n.bJg);
        this.feW.addHeaderView(this.jBF);
      }
      if ((!this.jBG) || (this.jBT))
        break label1822;
      if (this.jBE != null)
        this.jBE.findViewById(com.tencent.mm.i.akC).setBackgroundResource(h.Uk);
      this.jBr.a(this);
      this.feW.setAdapter(this.jBr);
      this.jBr.a(new fk(this));
      this.feW.setOnItemClickListener(new dw(this));
      if (this.jxE == 2)
        registerForContextMenu(this.feW);
      this.feW.setOnItemLongClickListener(new dx(this));
      int m = ViewConfiguration.get(this).getScaledTouchSlop();
      this.feW.setOnTouchListener(new dy(this, m));
      this.feW.setOnScrollListener(this.eue);
      if ((this.jxE == 2) && ((this.jwY == null) || (this.jwY.equals("@micromsg.qq.com"))))
        a(0, h.WK, new dz(this));
      if ((this.jxE == 3) || (this.jxE == 0) || (this.jxE == i) || (this.jxE == 5) || (this.jxE == 7) || (this.jxE == 12) || (this.jxE == 10) || (this.jxE == 11) || (this.jxE == 13))
      {
        if (this.jxE != i)
          break label1848;
        a(i, getString(n.btQ), new ea(this), cu.iMA);
        eB(this.jBr.aXx());
      }
      if ((this.jxE == 3) || (this.jxE == 0) || (this.jxE == i) || (this.jxE == 5) || (this.jxE == 7) || (this.jxE == 10))
      {
        if (this.jBJ.aAj() != 0)
          break label2027;
        C(i, getString(n.btQ));
      }
      eC(getIntent().getBooleanExtra("has_text_option_menu", i));
      Bt(this.jBs);
      if (!ap.jb(this.jBt))
        Bu(this.jBt);
      new eg(this);
      localei = new ei(this);
      switch (this.jxE)
      {
      case 2:
      case 6:
      case 8:
      case 9:
      default:
        Object[] arrayOfObject1 = new Object[i];
        arrayOfObject1[0] = Integer.valueOf(this.jxE);
        z.d("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "unkonw list type form set back button. listType:%d", arrayOfObject1);
        i2 = 0;
        label1343: if ((i2 == 0) && (("@black.android".equals(this.jwY)) || ("@domain.android".equals(this.jwY)) || ("@t.qq.com".equals(this.jwY))))
          a(localei);
        this.fqz = ((AlphabetScrollBar)findViewById(com.tencent.mm.i.aeL));
        if (this.jxB.bcb())
        {
          this.fqz.setVisibility(8);
          label1426: if (!"@t.qq.com".equals(this.jwY))
            break label2142;
          if (y.ql())
            break label2137;
          y(9, i);
        }
        break;
      case 0:
      case 1:
      case 3:
      case 4:
      case 5:
      case 7:
      case 10:
      case 11:
      case 12:
      case 13:
      }
    }
    label1597: label1603: label2027: boolean bool;
    label1822: label1848: label2137: label2142: 
    while (!"@qqim".equals(this.jwY))
      while (true)
      {
        if (this.jxE == 9)
          a(0, getString(n.btQ), new ej(this));
        return;
        this.glo = ((LabelContainerView)findViewById(com.tencent.mm.i.aeF));
        this.glp = ((ProgressBar)this.glo.findViewById(16908301));
        this.glq = ((TextView)this.glo.findViewById(16908310));
        this.glo.a(new fa(this));
        this.glr = ((MMTagPanel)findViewById(com.tencent.mm.i.aeG));
        this.glr.pI(h.abA);
        this.glr.pJ(f.OD);
        this.glr.a(new fb(this));
        break;
        int k = 0;
        break label318;
        if ((this.jxE == i) && (this.jBG))
        {
          this.jBE = View.inflate(this, com.tencent.mm.k.bgz, null);
          this.jBE.setOnClickListener(new fh(this));
          ((TextView)this.jBE.findViewById(com.tencent.mm.i.akC)).setText(n.bsh);
          this.feW.addHeaderView(this.jBE);
          break label790;
        }
        if ((this.jxE == 5) && (this.jBG))
        {
          this.jBE = View.inflate(this, com.tencent.mm.k.bgz, null);
          this.jBE.setOnClickListener(new fi(this));
          this.feW.addHeaderView(this.jBE);
          break label790;
        }
        if ((this.jxE == 3) && (this.jBG))
        {
          this.jBE = View.inflate(this, com.tencent.mm.k.bgz, null);
          this.jBE.setOnClickListener(new fj(this));
          this.feW.addHeaderView(this.jBE);
          break label790;
        }
        if ((this.jxE == 4) || (this.jxE != 12))
          break label790;
        this.jBE = View.inflate(this, com.tencent.mm.k.bgz, null);
        break label790;
        if (this.jBF == null)
          break label827;
        this.jBF.findViewById(com.tencent.mm.i.akC).setBackgroundResource(h.Uk);
        break label827;
        if (this.jxE == 12)
        {
          a(i, getString(n.btQ), new ec(this), cu.iMA);
          break label1106;
        }
        if (this.jxE == 13)
        {
          a(i, getString(n.btQ), new ed(this), cu.iMA);
          if (this.jBS)
          {
            eB(i);
            break label1106;
          }
          eB(this.jBr.aXx());
          break label1106;
        }
        if (this.jxE == 11)
        {
          a(i, getString(n.buh), new ee(this), cu.iMA);
          eB(this.jBr.aXx());
          break label1106;
        }
        a(i, getString(n.btQ), new ef(this), cu.iMA);
        eB(this.jBr.aXx());
        break label1106;
        C(i, getString(n.btQ) + "(" + this.jBJ.aAj() + ")");
        if (this.jBJ.aAj() > 0);
        int i1;
        for (int n = i; ; i1 = 0)
        {
          t(i, n);
          break;
        }
        a(localei);
        i2 = i;
        break label1343;
        this.fqz.setVisibility(0);
        this.fqz.a(this.fqC);
        break label1426;
        bool = false;
      }
    if (!y.qm());
    while (true)
    {
      y(10, bool);
      break;
      bool = false;
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (!ap.S(this));
    while ((com.tencent.mm.ui.dy.a(this, paramInt1, paramInt2, paramString, 4)) || (paramInt1 != 0) || (paramInt2 != 0))
      return;
    switch (paramx.getType())
    {
    default:
      return;
    case 38:
    }
    VC();
  }

  protected final String aPL()
  {
    if ("@biz.contact".equals(this.jwY))
      return "_bizContact";
    return "";
  }

  public final void aXG()
  {
    ArrayList localArrayList = this.jBr.fF(false);
    Intent localIntent = new Intent();
    localIntent.putExtra("Select_Contact", ap.a(localArrayList, ","));
    localIntent.putExtra("extra_id", this.ezB);
    localIntent.putExtra("consume_id", getIntent().getStringExtra("consume_id"));
    localIntent.putExtra("extra_coverurl", getIntent().getStringExtra("extra_coverurl"));
    localIntent.putExtra("extra_name", getIntent().getStringExtra("extra_name"));
    localIntent.putExtra("extra_price", getIntent().getStringExtra("extra_price"));
    localIntent.putExtra("extra_price_num", getIntent().getStringExtra("extra_price_num"));
    localIntent.putExtra("extra_price_type", getIntent().getStringExtra("extra_price_type"));
    localIntent.putExtra("google_price", getIntent().getStringExtra("google_price"));
    localIntent.putExtra("extra_flag", getIntent().getIntExtra("extra_flag", -1));
    localIntent.putExtra("extra_type", getIntent().getIntExtra("extra_type", -1));
    localIntent.putExtra("is_google_play", getIntent().getStringExtra("is_google_play"));
    localIntent.putExtra("share_desc", getIntent().getStringExtra("share_desc"));
    setResult(-1, localIntent);
    finish();
  }

  public final void aXH()
  {
    ArrayList localArrayList = this.jBr.fF(true);
    localArrayList.remove(com.tencent.mm.model.x.pG());
    if (localArrayList.size() > 0)
    {
      this.dWT = com.tencent.mm.ui.base.e.a(aPI(), getString(n.bRf), false, null);
      bg.qQ().n(new ez(this, localArrayList));
    }
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bmA;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    z.i("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "onAcvityResult requestCode: %d", arrayOfObject);
    if ((paramInt1 == 6) && (paramInt2 == -1))
    {
      setResult(-1);
      finish();
    }
    label259: String str4;
    do
    {
      ArrayList localArrayList3;
      do
      {
        String str5;
        do
        {
          do
            return;
          while (paramInt2 != -1);
          switch (paramInt1)
          {
          case 6:
          case 7:
          default:
            return;
          case 4:
            if (!this.jBU)
              break label259;
            str5 = paramIntent.getStringExtra("Select_Contact");
            z.d("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "cpan[onActivityResult] %s", new Object[] { str5 });
          case 5:
          case 8:
          }
        }
        while (ap.jb(str5));
        localArrayList3 = (ArrayList)ap.b(str5.split(","));
      }
      while ((localArrayList3 == null) || (localArrayList3.isEmpty()));
      int k = localArrayList3.size();
      ArrayList localArrayList4 = new ArrayList();
      for (int m = 0; m < k; m++)
      {
        String str6 = (String)localArrayList3.get(m);
        if ((!com.tencent.mm.model.x.cY(str6)) && (y.di(str6)) && (!this.jBr.CF(str6)))
          localArrayList4.add(str6);
      }
      this.jBr.H(localArrayList4);
      this.jBJ.aV(localArrayList4);
      return;
      setResult(-1, paramIntent);
      finish();
      return;
      str4 = paramIntent.getStringExtra("Select_Contact");
    }
    while (ch.jb(str4));
    if (this.jBB.endsWith("@chatroom"))
    {
      bJ(str4, this.jBB);
      return;
    }
    bI(str4, this.jBB);
    return;
    ArrayList localArrayList1;
    int i;
    ArrayList localArrayList2;
    int j;
    switch (this.jxE)
    {
    default:
      String str2 = paramIntent.getStringExtra("Select_Contact");
      z.d("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "cpan[onActivityResult] %s", new Object[] { str2 });
      if (!ap.jb(str2))
      {
        localArrayList1 = (ArrayList)ap.b(str2.split(","));
        if ((localArrayList1 != null) && (!localArrayList1.isEmpty()))
        {
          i = localArrayList1.size();
          localArrayList2 = new ArrayList();
          j = 0;
        }
      }
      break;
    case 4:
      while (j < i)
      {
        String str3 = (String)localArrayList1.get(j);
        if ((!com.tencent.mm.model.x.cY(str3)) && (y.di(str3)) && (!this.jBr.CF(str3)))
          localArrayList2.add(str3);
        j++;
        continue;
        String str1 = paramIntent.getStringExtra("Chat_User");
        z.d("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "cpan[onActivityResult] %s", new Object[] { str1 });
        if (this.jBC)
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("Select_Conv_User", str1);
          setResult(-1, localIntent);
          finish();
        }
        while (this.jBB.endsWith("@chatroom"))
        {
          bJ(str1, this.jBB);
          return;
          if (y.dG(str1))
            z.e("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "error, never here");
        }
        bI(str1, this.jBB);
        return;
      }
      this.jBr.H(localArrayList2);
      this.jBJ.aV(localArrayList2);
    }
    if (this.jBJ != null)
      this.jBJ.clearFocus();
    qy(fl.jCd);
  }

  public void onBackPressed()
  {
    if (this.jBW == fl.jCe)
    {
      qy(fl.jCd);
      if (this.jBJ != null)
        this.jBJ.clearFocus();
      return;
    }
    super.onBackPressed();
  }

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    super.onContextItemSelected(paramMenuItem);
    com.tencent.mm.storage.i locali2;
    switch (paramMenuItem.getItemId())
    {
    default:
      return true;
    case 1:
    case 2:
      locali2 = bg.qW().oT().ys(this.jBK);
      locali2.oA();
      y.n(locali2);
      if (y.dc(this.jBK))
      {
        bg.qW().oT().yz(this.jBK);
        bg.qW().oZ().xX(this.jBK);
        bg.qX().d(new com.tencent.mm.ab.k(5));
      }
      break;
    case 7:
    }
    while (true)
    {
      VC();
      return true;
      this.ekQ = false;
      getString(n.buo);
      this.esI = com.tencent.mm.ui.base.e.a(this, getString(n.buA), true, new ev(this));
      bw.a(this.jBK, new ew(this));
      bg.qW().oT().a(this.jBK, locali2);
      bg.qW().oW().yC(this.jBK);
      break;
      com.tencent.mm.storage.i locali1 = bg.qW().oT().ys(this.jBK);
      locali1.oA();
      y.n(locali1);
      bg.qX().d(new com.tencent.mm.ab.k(5));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bg.qX().a(30, this);
    bg.qX().a(38, this);
    com.tencent.mm.pluginsdk.c.b.a("NetSceneCreateChatRoom", this.jBV);
    this.jwY = getIntent().getStringExtra("Contact_GroupFilter_Type");
    if (ap.ja(this.jwY).length() <= 0)
      this.jwY = "@micromsg.qq.com";
    this.jxa = getIntent().getStringExtra("Contact_GroupFilter_Str");
    this.jBs = getIntent().getStringExtra("Contact_GroupFilter_DisplayName");
    this.jBt = getIntent().getStringExtra("address_ui_sub_title");
    this.jBO = getIntent().getBooleanExtra("single_chat", false);
    this.jBw = getIntent().getStringExtra("Chatroom_member_list");
    this.jBz = getIntent().getBooleanExtra("Show_Chatroom_member", false);
    this.jBu = getIntent().getStringExtra("Block_list");
    this.jBv = getIntent().getStringExtra("Disabled_Selected_list");
    this.jxE = getIntent().getIntExtra("List_Type", 2);
    this.jBy = getIntent().getBooleanExtra("Add_SendCard", false);
    this.jBG = getIntent().getBooleanExtra("Need_Group_Item", true);
    if (((this.jBG) && (y.qk().size() == 0)) || ((this.jxE == 0) && (this.jBO)))
      this.jBG = false;
    this.jBP = getIntent().getBooleanExtra("recommend_friends", false);
    this.jBM = getIntent().getBooleanExtra("Need_Voice_Search", false);
    this.jBN = getIntent().getBooleanExtra("to_talk_room", false);
    this.jxl = getIntent().getBooleanExtra("favour_include_biz", false);
    this.ezB = getIntent().getStringExtra("extra_id");
    this.jBQ = getIntent().getBooleanExtra("shareImage", false);
    this.jBR = getIntent().getStringExtra("shareImagePath");
    this.jBS = getIntent().getBooleanExtra("enable_menu_when_no_select", false);
    this.jBT = getIntent().getBooleanExtra("show_facing_chat", false);
    this.glu = getIntent().getBooleanExtra("show_label", true);
    this.jBU = getIntent().getBooleanExtra("from_add_label", false);
    String str1 = getIntent().getStringExtra("Add_address_titile");
    if ((this.jBy) || (this.jBP))
    {
      this.jBA = ap.Y(getIntent().getStringExtra("be_send_card_name"), "");
      this.jBB = ap.Y(getIntent().getStringExtra("received_card_name"), "");
    }
    if ((str1 != null) && (!str1.equals("")))
      this.jBs = str1;
    ArrayList localArrayList;
    while (true)
    {
      if ("@biz.contact".equals(this.jwY))
        this.jBs = getString(n.bsn);
      DP();
      String str2 = this.jBv;
      List localList = null;
      if (str2 != null)
      {
        boolean bool = this.jBv.equals("");
        localList = null;
        if (!bool)
          localList = ap.b(this.jBv.split(","));
      }
      this.jBJ.aU(localList);
      if ((localList != null) && (localList.size() != 0))
        this.jBr.bh(localList);
      localArrayList = getIntent().getStringArrayListExtra("already_selected_users");
      if ((localArrayList != null) && (localArrayList.size() != 0))
        break;
      return;
      if (this.jxE == 0)
      {
        if (this.jBO)
          this.jBs = getString(n.bsv);
        else
          this.jBs = getString(n.bsu);
      }
      else if ((this.jxE == 5) || (this.jxE == 7) || (this.jxE == 9))
      {
        this.jBs = getString(n.bsw);
      }
      else if (this.jxE == 1)
      {
        this.jBs = getString(n.bss);
      }
      else if (this.jxE == 6)
      {
        this.jBs = getString(n.bsw);
        this.jxE = 1;
      }
      else if ((this.jxE == 3) || (this.jxE == 10))
      {
        this.jBs = getString(n.bsw);
      }
      else if (this.jxE == 4)
      {
        this.jBs = getString(n.bsw);
        this.jBC = getIntent().getBooleanExtra("select_contact_pick_result", false);
      }
      else if (this.jxE == 11)
      {
        this.jBs = getString(n.bst);
      }
      else if (ap.ja(this.jBs).length() <= 0)
      {
        this.jBs = getString(n.bNg);
      }
    }
    this.jBr.G(localArrayList);
    this.jBJ.aV(localArrayList);
    if (this.jBJ.aAj() == 0)
    {
      C(1, getString(n.btQ));
      return;
    }
    C(1, getString(n.btQ) + "(" + this.jBJ.aAj() + ")");
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    com.tencent.mm.storage.i locali = bg.qW().oT().ys(this.jBK);
    if (locali == null)
      z.e("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "onCreateContextMenu, contact is null, username = " + this.jBK);
    do
    {
      do
        return;
      while (("@domain.android".equals(this.jwY)) || ("@black.android".equals(this.jwY)) || ("@t.qq.com".equals(this.jwY)) || (com.tencent.mm.model.x.pG().equals(locali.getUsername())));
      if (y.de(this.jBK))
      {
        paramContextMenu.setHeaderTitle(com.tencent.mm.ar.b.e(this, locali.od(), -1));
        paramContextMenu.add(localAdapterContextMenuInfo.position, 2, 0, n.bsc);
        return;
      }
    }
    while (y.du(this.jBK));
    paramContextMenu.setHeaderTitle(com.tencent.mm.ar.b.e(this, locali.od(), -1));
    paramContextMenu.add(localAdapterContextMenuInfo.position, 1, 0, n.bsb);
  }

  protected void onDestroy()
  {
    z.v("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "onDestory");
    bg.qX().b(30, this);
    bg.qX().b(38, this);
    com.tencent.mm.pluginsdk.c.b.b("NetSceneCreateChatRoom", this.jBV);
    this.fqz.aTw();
    this.jBr.closeCursor();
    this.jBr.detach();
    this.jBr.aOD();
    if (this.hos != null)
      this.hos.dismiss();
    if (this.jxB != null)
    {
      this.jxB.detach();
      this.jxB.closeCursor();
    }
    super.onDestroy();
  }

  protected void onPause()
  {
    if (this.hos != null)
      this.hos.dismiss();
    bg.qW().oQ().set(12296, Boolean.valueOf(this.jxG));
    if (this.jxB != null)
      this.jxB.onPause();
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    this.gls = false;
    bg.qQ().n(new fc(this));
    aWO();
    this.jxG = ((Boolean)bg.qW().oQ().get(12296, Boolean.valueOf(false))).booleanValue();
    if (this.jxE == 2)
    {
      com.tencent.mm.storage.i locali = bg.qW().oT().ys(com.tencent.mm.model.x.pG());
      if ((locali != null) && ((!a.cv(locali.getType())) || (!ap.jb(locali.ja())) || (!ap.jb(locali.jg())) || (!ap.jb(locali.jh()))))
      {
        locali.oz();
        locali.aT("");
        locali.aZ("");
        locali.ba("");
        bg.qW().oT().a(com.tencent.mm.model.x.pG(), locali);
      }
    }
    VC();
    if (this.jxB != null)
      this.jxB.onResume();
  }

  public final void qy(int paramInt)
  {
    if (this.glu)
      this.jBW = paramInt;
    switch (ff.jCc[(-1 + this.jBW)])
    {
    default:
      return;
    case 1:
      this.glo.setVisibility(8);
      this.feW.setVisibility(0);
      this.fqz.setVisibility(0);
      return;
    case 2:
      this.glp.setVisibility(0);
      this.glq.setText(n.btG);
      this.glo.setVisibility(0);
      this.glr.a(null, this.glt);
      this.fqz.setVisibility(8);
      return;
    case 3:
      this.glp.setVisibility(8);
      this.glq.setText(n.bPw);
      this.glo.setVisibility(0);
      this.glr.a(null, this.glt);
      this.fqz.setVisibility(8);
      return;
    case 4:
      this.glp.setVisibility(8);
      this.glq.setText(n.azu);
      this.glo.setVisibility(0);
      this.glr.a(null, this.glt);
      this.fqz.setVisibility(8);
      return;
    case 5:
    }
    this.glo.setVisibility(8);
    this.feW.setVisibility(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI
 * JD-Core Version:    0.6.2
 */