package com.tencent.mm.ui.transmit;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.widget.AbsListView.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.am.a;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.y;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.plugin.base.stub.e;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.model.app.ReportUtil.ReportArgs;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.contact.da;
import com.tencent.mm.ui.contact.dc;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class SelectConversationUI extends MMActivity
{
  private da fqy;
  private String jBB;
  private View jBH;
  private View jBI;
  private MultiSelectContactView jBJ;
  private boolean jBN = false;
  private boolean jBy = false;
  private ListView jYv;
  private ReportUtil.ReportArgs jYw;
  private boolean jYx;
  private int jYy = 2;

  private void Dw(String paramString)
  {
    z.d("!44@/B4Tb64lLpJQGo7VtHU/glxECqNzQuUbU+29i/gx8/w=", "dealItemClick, %s", new Object[] { paramString });
    Intent localIntent1 = new Intent();
    localIntent1.putExtra("Select_Conv_User", paramString);
    Intent localIntent2 = (Intent)getIntent().getParcelableExtra("Select_Conv_NextStep");
    if (localIntent2 != null)
    {
      a(localIntent1, localIntent2);
      return;
    }
    if (this.jYx)
    {
      d(localIntent1, paramString);
      return;
    }
    if (this.jBy)
    {
      if (paramString.endsWith("@chatroom"))
      {
        bJ(this.jBB, paramString);
        return;
      }
      bI(this.jBB, paramString);
      return;
    }
    if (this.jBN)
    {
      Intent localIntent3 = new Intent();
      localIntent3.putExtra("enter_room_username", paramString);
      a.b(this, "talkroom", ".ui.TalkRoomUI", localIntent3);
      finish();
      return;
    }
    setResult(-1, localIntent1);
    finish();
    XF();
  }

  private void a(Intent paramIntent1, Intent paramIntent2)
  {
    z.d("!44@/B4Tb64lLpJQGo7VtHU/glxECqNzQuUbU+29i/gx8/w=", "has next step, jump now, intent=" + paramIntent2);
    paramIntent2.putExtras(paramIntent1.getExtras());
    startActivityForResult(paramIntent2, 2);
  }

  private void bI(String paramString1, String paramString2)
  {
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(paramString2);
    if (localLinkedList.size() > 0)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("be_send_card_name", paramString1);
      localIntent.putExtra("received_card_name", ap.a(localLinkedList, ","));
      localIntent.putExtra("Is_Chatroom", false);
      setResult(-1, localIntent);
      finish();
    }
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

  private void d(Intent paramIntent, String paramString)
  {
    if (ap.jb(paramString))
    {
      z.v("!44@/B4Tb64lLpJQGo7VtHU/glxECqNzQuUbU+29i/gx8/w=", "avatarUseName is null or nil show dialog fail ");
      return;
    }
    boolean bool = y.dc(paramString);
    String str = null;
    if (bool)
      str = "(" + com.tencent.mm.model.v.cW(paramString) + ")";
    com.tencent.mm.pluginsdk.ui.applet.r.b(this.iLr, paramString, getString(com.tencent.mm.n.cah), paramString, str, getString(com.tencent.mm.n.buh), new v(this, paramIntent));
  }

  protected final void DP()
  {
    this.jYv = ((ListView)findViewById(i.aNV));
    this.jBH = findViewById(i.aPq);
    this.jBJ = ((MultiSelectContactView)findViewById(i.aeH));
    this.jBJ.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, -2147483648), View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().heightPixels, -2147483648));
    this.jBI = new View(aPI());
    AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, this.jBJ.getMeasuredHeight());
    this.jBI.setLayoutParams(localLayoutParams);
    this.jBI.setVisibility(4);
    this.jYv.addHeaderView(this.jBI);
    this.jBJ.a(new n(this));
    View localView = View.inflate(this, k.bmD, null);
    if (this.jBy)
      ((TextView)localView.findViewById(i.aEY)).setText(com.tencent.mm.n.cdE);
    this.jYv.addHeaderView(localView);
    this.fqy = new da(this);
    this.fqy.aXk();
    this.fqy.aXu();
    this.fqy.RM();
    this.fqy.a(new o(this));
    this.jYv.setAdapter(this.fqy);
    this.jYv.setOnItemClickListener(new q(this));
    this.jYv.setOnScrollListener(new r(this));
    oP(com.tencent.mm.n.cdD);
    a(new s(this));
    this.jYw = ((ReportUtil.ReportArgs)getIntent().getParcelableExtra("Select_Report_Args"));
    String str1 = getIntent().getStringExtra("Select_App_Id");
    String str2 = getIntent().getStringExtra("Select_Open_Id");
    z.d("!44@/B4Tb64lLpJQGo7VtHU/glxECqNzQuUbU+29i/gx8/w=", "initView, appId = " + str1 + ", openId = " + str2);
    if ((!ap.jb(str1)) && (!ap.jb(str2)))
      new e(this, str1, str2, new t(this)).HJ();
    int i = ViewConfiguration.get(this).getScaledTouchSlop();
    this.jYv.setOnTouchListener(new u(this, i));
  }

  protected final boolean aPD()
  {
    return true;
  }

  protected final int getLayoutId()
  {
    return k.bmC;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    z.e("!44@/B4Tb64lLpJQGo7VtHU/glxECqNzQuUbU+29i/gx8/w=", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = " + paramIntent);
    if (paramIntent != null)
      z.e("!44@/B4Tb64lLpJQGo7VtHU/glxECqNzQuUbU+29i/gx8/w=", "onActivityResult, data.toString() = " + paramIntent.toString());
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
      if (paramInt2 == -1)
      {
        z.e("!44@/B4Tb64lLpJQGo7VtHU/glxECqNzQuUbU+29i/gx8/w=", "getIntent = " + getIntent());
        Intent localIntent2 = (Intent)getIntent().getParcelableExtra("Select_Conv_NextStep");
        if (localIntent2 == null)
          break label140;
        a(paramIntent, localIntent2);
      }
    label140: 
    do
    {
      do
      {
        return;
        if (this.jYx)
        {
          d(paramIntent, paramIntent.getStringExtra("Select_Conv_User"));
          return;
        }
        setResult(-1, paramIntent);
        finish();
        return;
        if (paramInt1 != 2)
          break;
        switch (paramInt2)
        {
        default:
          return;
        case -1:
          finish();
        case 0:
        }
      }
      while ((paramIntent == null) || (!paramIntent.getBooleanExtra("Select_stay_in_wx", false)));
      Intent localIntent1 = new Intent(this, TaskRedirectUI.class);
      localIntent1.addFlags(268435456);
      startActivity(localIntent1);
      return;
    }
    while (paramIntent == null);
    this.jYw = ((ReportUtil.ReportArgs)paramIntent.getParcelableExtra("Select_Report_Args"));
    return;
    if (paramInt1 == 3)
    {
      switch (paramInt2)
      {
      default:
        return;
      case -1:
      }
      String str;
      if (paramIntent != null)
      {
        str = paramIntent.getStringExtra("received_card_name");
        if (!ch.jb(str))
        {
          if (!str.endsWith("@chatroom"))
            break label338;
          bJ(this.jBB, str);
        }
      }
      while (true)
      {
        finish();
        return;
        label338: bI(this.jBB, str);
      }
    }
    if ((paramInt1 == 4) && (paramInt2 == -1))
      Dw(paramIntent.getStringExtra("Select_Conv_User"));
    z.e("!44@/B4Tb64lLpJQGo7VtHU/glxECqNzQuUbU+29i/gx8/w=", "onActivityResult, unknown requestCode = " + paramInt1);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jYx = getIntent().getBooleanExtra("select_is_ret", false);
    this.jBy = getIntent().getBooleanExtra("Select_Send_Card", false);
    if (this.jBy)
      this.jBB = getIntent().getStringExtra("Select_Talker_Name");
    this.jBN = getIntent().getBooleanExtra("To_Talk_Room", false);
    this.jYy = getIntent().getIntExtra("Select_Conv_Type", 2);
    DP();
  }

  protected void onDestroy()
  {
    this.fqy.Cc();
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      XF();
      if (this.jYw != null)
        ReportUtil.a(this, this.jYw);
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI
 * JD-Core Version:    0.6.2
 */