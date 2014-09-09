package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.widget.AbsListView.LayoutParams;
import android.widget.ListView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.g;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.a;
import com.tencent.mm.ui.base.AlphabetScrollBar;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.cu;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SnsAddressUI extends MMActivity
{
  public static final int gvf = g.ihX;
  private ListView feW;
  private com.tencent.mm.ui.base.fy fqC = new fu(this);
  private AlphabetScrollBar fqz;
  private int gzu = 0;
  private cn hos;
  private MultiSelectContactView jBJ;
  private String jBu;
  private String jCr = "";
  private fq jCu;
  private String jCv = "";
  private String jCw = "@micromsg.qq.com";
  private int jCx = 0;
  private int jxE;
  private String jxa;

  private void vp(String paramString)
  {
    this.jBJ.vp(paramString);
  }

  protected final void DP()
  {
    this.feW = ((ListView)findViewById(i.aeA));
    String str1 = this.jCw;
    String str2 = this.jxa;
    this.jCu = new fq(this, str1, str2, this.jCr);
    this.jCu.a(new ft(this));
    this.jBJ = ((MultiSelectContactView)findViewById(i.aeH));
    this.jBJ.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, -2147483648), View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().heightPixels, -2147483648));
    View localView = new View(aPI());
    localView.setLayoutParams(new AbsListView.LayoutParams(-1, this.jBJ.getMeasuredHeight()));
    localView.setVisibility(4);
    this.feW.addHeaderView(localView);
    this.jBJ.a(new gc(this));
    this.jBJ.a(new gd(this));
    this.feW.setAdapter(this.jCu);
    this.feW.setOnItemClickListener(new fv(this));
    int i = ViewConfiguration.get(this).getScaledTouchSlop();
    this.feW.setOnTouchListener(new fw(this, i));
    this.feW.setOnScrollListener(new a(new fx(this)));
    a(1, getString(n.btQ), new fy(this), cu.iMA);
    eB(this.jCu.aXx());
    new ga(this);
    a(new gb(this));
    this.fqz = ((AlphabetScrollBar)findViewById(i.aeL));
    this.fqz.setVisibility(0);
    this.fqz.a(this.fqC);
    int j = this.jCu.aXy().size();
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = getString(n.btQ);
    arrayOfObject[1] = Integer.valueOf(j + this.gzu);
    arrayOfObject[2] = Integer.valueOf(gvf);
    C(1, String.format("%s(%d/%d)", arrayOfObject));
  }

  public void finish()
  {
    XF();
    super.finish();
  }

  protected final int getLayoutId()
  {
    return k.bmA;
  }

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    super.onContextItemSelected(paramMenuItem);
    return true;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jxa = getIntent().getStringExtra("Contact_GroupFilter_Str");
    this.jBu = getIntent().getStringExtra("Block_list");
    this.jCr = ch.Y(getIntent().getStringExtra("Add_get_from_sns"), "");
    this.jCv = ch.Y(getIntent().getStringExtra("Select_Contact"), "");
    this.jCw = ch.Y(getIntent().getStringExtra("Contact_GroupFilter_Type"), "@micromsg.qq.com");
    String str = getIntent().getStringExtra("Add_address_titile");
    this.gzu = getIntent().getIntExtra("sns_address_count", 0);
    Bt(str);
    DP();
    if ((this.jCv != null) && (!this.jCv.equals("")));
    for (List localList1 = ch.b(this.jCv.split(",")); ; localList1 = null)
    {
      if ((localList1 != null) && (localList1.size() != 0))
      {
        this.jCu.bg(localList1);
        int i = localList1.size();
        for (int j = 0; j < i; j++)
          vp((String)localList1.get(j));
      }
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = getString(n.btQ);
      arrayOfObject[1] = Integer.valueOf(this.jCu.aXK() + this.gzu);
      arrayOfObject[2] = Integer.valueOf(gvf);
      C(1, String.format("%s(%d/%d)", arrayOfObject));
      boolean bool;
      LinkedList localLinkedList;
      List localList2;
      if (this.jCu.aXK() > 0)
      {
        bool = true;
        t(1, bool);
        localLinkedList = new LinkedList();
        if ((this.jBu == null) || (this.jBu.equals("")))
          break label728;
        localList2 = ch.b(this.jBu.split(","));
        this.jCx = localList2.size();
      }
      label728: for (Object localObject = localList2; ; localObject = localLinkedList)
      {
        new LinkedList();
        Iterator localIterator = y.qr().iterator();
        while (true)
          if (localIterator.hasNext())
          {
            ((List)localObject).add((String)localIterator.next());
            continue;
            bool = false;
            break;
          }
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
        this.jCu.bc((List)localObject);
        return;
      }
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }

  public void onDestroy()
  {
    this.fqz.aTw();
    this.jCu.closeCursor();
    this.jCu.aOD();
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      finish();
      if (!getIntent().getBooleanExtra("stay_in_wechat", true))
        moveTaskToBack(true);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onPause()
  {
    if (this.hos != null)
      this.hos.dismiss();
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    if (this.jCu != null)
      this.jCu.a(null, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SnsAddressUI
 * JD-Core Version:    0.6.2
 */