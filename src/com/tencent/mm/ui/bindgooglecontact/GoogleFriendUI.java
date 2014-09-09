package com.tencent.mm.ui.bindgooglecontact;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.modelfriend.ae;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.n;
import com.tencent.mm.n.af;
import com.tencent.mm.protocal.a.pm;
import com.tencent.mm.protocal.a.qv;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.friend.InviteFriendUI;
import com.tencent.mm.ui.tools.fj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class GoogleFriendUI extends MMActivity
  implements AdapterView.OnItemClickListener, com.tencent.mm.n.p, com.tencent.mm.o.m, q
{
  private HashMap dwD = new HashMap();
  private String dwE;
  private boolean eHT = false;
  private ProgressDialog eyO;
  private TextView fcc;
  private String ffb;
  private ListView jiG;
  private p jiH;
  private com.tencent.mm.x.e jiI;
  private ArrayList jiJ = new ArrayList();
  private boolean jia = false;
  private String jic;
  private int jie;
  private String jiw;

  private void Mj()
  {
    if ((this.eyO == null) || (!this.eyO.isShowing()))
    {
      getString(n.buo);
      this.eyO = com.tencent.mm.ui.base.e.a(this, getString(n.buA), true, new x(this));
    }
  }

  private void a(Cursor paramCursor, ad paramad)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    if (paramCursor != null)
    {
      paramCursor.moveToFirst();
      int i = paramCursor.getCount();
      for (int j = 0; j < i; j++)
      {
        ad localad = new ad();
        localad.b(paramCursor);
        localArrayList1.add(localad.field_googlegmail);
        localArrayList2.add(Integer.valueOf(j));
        localArrayList3.add(localad);
        paramCursor.moveToNext();
      }
      localArrayList2.add(Integer.valueOf(-1));
    }
    ActionBarActivity localActionBarActivity = aPI();
    String str = getResources().getString(n.bMX);
    getResources().getString(n.bsK);
    com.tencent.mm.ui.base.e.a(localActionBarActivity, str, localArrayList1, localArrayList2, new w(this, localArrayList3, paramad));
  }

  private void a(ad paramad1, ad paramad2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramad1.field_googlegmail);
    com.tencent.mm.x.d locald = new com.tencent.mm.x.d(localArrayList);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramad1.field_googleitemid;
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "gmailItem:%s", arrayOfObject);
    bg.qX().d(locald);
    if (paramad2 == null)
    {
      locald.gJ(paramad1.field_googleitemid);
      paramad1.field_googlecgistatus = 0;
      az.xh().b(paramad1);
    }
    while (true)
    {
      this.jiH.DW();
      return;
      locald.gJ(paramad2.field_googleitemid);
      paramad2.field_googlecgistatus = 0;
      az.xh().b(paramad2);
    }
  }

  private void a(qv paramqv)
  {
    try
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramqv.huF);
      com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "handleListGoogleContactCGIResponse Count:%d", arrayOfObject);
      if (this.jiH != null)
        this.jiH.DW();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void aTX()
  {
    if ((this.eyO != null) && (this.eyO.isShowing()))
      this.eyO.dismiss();
  }

  private void aTZ()
  {
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "updateToken");
    if (this.jia)
      this.dwE = ((String)bg.qW().oQ().get(208901));
    while ((TextUtils.isEmpty(this.dwE)) || ((!this.jia) && (TextUtils.isEmpty(this.jiw))))
    {
      d(BindGoogleContactUI.class);
      finish();
      return;
      this.dwE = ((String)bg.qW().oQ().get(208902));
      this.jiw = ((String)bg.qW().oQ().get(208904));
    }
    if (this.jia)
    {
      aUa();
      return;
    }
    Mj();
    new aa(this, this.jiw).execute(new Void[0]);
  }

  private void aUa()
  {
    this.eHT = false;
    Mj();
    new z(this, this, this.dwE, (byte)0).execute(new Void[0]);
  }

  private void fd(boolean paramBoolean)
  {
    this.fcc.setVisibility(0);
    String str;
    if (!bc.by(this))
      str = getString(n.bMW);
    while (true)
    {
      this.fcc.setText(str);
      return;
      if (paramBoolean)
        str = getString(n.bMP);
      else
        str = getString(n.bMO);
    }
  }

  protected final void DP()
  {
    oP(n.bMQ);
    a(new t(this));
    this.fcc = ((TextView)findViewById(com.tencent.mm.i.empty));
    this.jiG = ((ListView)findViewById(com.tencent.mm.i.awE));
    this.jiG.setAdapter(this.jiH);
    this.jiG.setOnItemClickListener(this);
    fj localfj = new fj(true, true);
    localfj.a(new u(this));
    a(localfj);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    if (TextUtils.isEmpty(paramString))
      paramString = "";
    arrayOfObject1[2] = paramString;
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", arrayOfObject1);
    int i = paramx.getType();
    if ((paramInt1 == 0) && (paramInt2 == 0))
      switch (i)
      {
      default:
        com.tencent.mm.sdk.platformtools.z.w("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "Unknow scene type.");
      case 489:
      case 30:
      case 137:
      case 488:
      }
    while (true)
    {
      aTX();
      return;
      if (this.jiH != null)
      {
        com.tencent.mm.x.d locald2 = (com.tencent.mm.x.d)paramx;
        int k = locald2.xB().huF;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(k);
        com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "count:%d", arrayOfObject3);
        locald2.xC();
        String str4 = locald2.xA();
        com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "gmailItem:%s", new Object[] { str4 });
        az.xh().n(str4, 1);
        this.jiH.DW();
        continue;
        if (this.jiH != null)
        {
          com.tencent.mm.pluginsdk.model.p localp2 = (com.tencent.mm.pluginsdk.model.p)paramx;
          localp2.ayy();
          String str3 = localp2.xA();
          com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "gmailItem:%s", new Object[] { str3 });
          az.xh().n(str3, 1);
          this.jiH.DW();
          continue;
          a(((com.tencent.mm.x.e)paramx).xD());
          continue;
          switch (i)
          {
          default:
            com.tencent.mm.sdk.platformtools.z.w("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "Unknow scene type.");
            break;
          case 489:
            if (this.jiH != null)
            {
              com.tencent.mm.x.d locald1 = (com.tencent.mm.x.d)paramx;
              int j = locald1.xB().huF;
              Object[] arrayOfObject2 = new Object[1];
              arrayOfObject2[0] = Integer.valueOf(j);
              com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "count:%d", arrayOfObject2);
              locald1.xC();
              String str2 = locald1.xA();
              com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "gmailItem:%s", new Object[] { str2 });
              az.xh().n(str2, 1);
              this.jiH.DW();
            }
            break;
          case 30:
          case 137:
            if (paramInt2 == -87)
              com.tencent.mm.ui.base.e.o(this, getString(n.bBh), "");
            if (this.jiH != null)
            {
              com.tencent.mm.pluginsdk.model.p localp1 = (com.tencent.mm.pluginsdk.model.p)paramx;
              localp1.ayy();
              String str1 = localp1.xA();
              com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "gmailItem:%s", new Object[] { str1 });
              az.xh().n(str1, 2);
              this.jiH.DW();
            }
            break;
          case 488:
            fd(false);
          }
        }
      }
    }
  }

  public final void eX(String paramString)
  {
    if (this.jiH != null)
      this.jiH.notifyDataSetChanged();
  }

  protected final int getLayoutId()
  {
    return k.bgt;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "requestCode:%d, resultCode:%d", arrayOfObject);
    if (paramInt1 == 2005)
    {
      if (paramInt2 == -1)
      {
        this.jia = paramIntent.getBooleanExtra("gpservices", false);
        aTZ();
      }
    }
    else
      return;
    this.jia = paramIntent.getBooleanExtra("gpservices", false);
    finish();
  }

  public void onBackPressed()
  {
    super.onBackPressed();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jic = ((String)bg.qW().oQ().get(208903));
    if (TextUtils.isEmpty(this.jic))
      finish();
    this.jie = getIntent().getIntExtra("enter_scene", 0);
    this.jiH = new p(this, this.jic);
    this.jiH.a(this);
    DP();
    this.jia = com.tencent.mm.modelfriend.ac.A(this);
    if (this.jia)
    {
      com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "startActivityCheckGooglePlayServices");
      startActivityForResult(new Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 2005);
    }
    while (true)
    {
      az.xh().clear();
      return;
      aTZ();
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    az.xh().clear();
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "onItemClick position:%d,", arrayOfObject1);
    ad localad;
    String str;
    if (this.jiH != null)
    {
      int i = paramInt - this.jiG.getHeaderViewsCount();
      localad = (ad)this.jiH.getItem(i);
      if (localad != null)
      {
        str = localad.field_username;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = localad.field_googlegmail;
        arrayOfObject2[1] = str;
        com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "jumpToProfile email:%s, username:%s", arrayOfObject2);
        com.tencent.mm.storage.i locali = bg.qW().oT().ys(str);
        if (((locali == null) || (!com.tencent.mm.g.a.cv(locali.getType()))) && (TextUtils.isEmpty(localad.field_nickname)))
          break label261;
        Intent localIntent2 = new Intent();
        localIntent2.putExtra("Contact_User", str);
        localIntent2.putExtra("Contact_Nick", localad.field_nickname);
        localIntent2.putExtra("Contact_ShowFMessageList", true);
        localIntent2.putExtra("verify_gmail", localad.field_googlegmail);
        localIntent2.putExtra("profileName", localad.field_googlename);
        localIntent2.putExtra("Contact_Source_FMessage", 58);
        localIntent2.putExtra("Contact_Scene", 58);
        if ((str != null) && (str.length() > 0))
          com.tencent.mm.plugin.a.a.dWo.c(localIntent2, aPI());
      }
    }
    return;
    label261: Intent localIntent1 = new Intent(this, InviteFriendUI.class);
    localIntent1.putExtra("friend_type", 2);
    localIntent1.putExtra("friend_user_name", str);
    localIntent1.putExtra("friend_num", localad.field_googlegmail);
    localIntent1.putExtra("friend_nick", localad.field_googlename);
    localIntent1.putExtra("friend_weixin_nick", localad.field_nickname);
    localIntent1.putExtra("friend_googleID", localad.field_googleid);
    localIntent1.putExtra("friend_googleItemID", localad.field_googleitemid);
    localIntent1.putExtra("friend_scene", 58);
    localIntent1.putExtra("Contact_Scene", 58);
    startActivity(localIntent1);
  }

  protected void onResume()
  {
    super.onResume();
    bg.qX().a(488, this);
    bg.qX().a(489, this);
    af.sh().d(this);
    if (this.jiH != null)
      this.jiH.DW();
  }

  protected void onStop()
  {
    super.onStop();
    bg.qX().b(488, this);
    bg.qX().b(489, this);
    af.sh().e(this);
  }

  public final void qb(int paramInt)
  {
    if (this.jiH == null);
    while (true)
    {
      return;
      ad localad = (ad)this.jiH.getItem(paramInt);
      if (localad != null)
      {
        switch (localad.field_status)
        {
        default:
          return;
        case 0:
          com.tencent.mm.pluginsdk.ui.applet.a locala = new com.tencent.mm.pluginsdk.ui.applet.a(this, new v(this), localad.field_googleitemid);
          LinkedList localLinkedList = new LinkedList();
          localLinkedList.add(Integer.valueOf(58));
          locala.f(localad.field_username, localLinkedList);
          localad.field_googlecgistatus = 0;
          az.xh().b(localad);
          this.jiH.DW();
          return;
        case 1:
        }
        String str = localad.field_googleid;
        Cursor localCursor = az.xh().gx(str);
        if (localCursor.getCount() <= 1)
          a(localad, null);
        while (localCursor != null)
        {
          localCursor.close();
          return;
          a(localCursor, localad);
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.GoogleFriendUI
 * JD-Core Version:    0.6.2
 */