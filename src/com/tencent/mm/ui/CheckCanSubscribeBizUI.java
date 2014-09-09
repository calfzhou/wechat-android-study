package com.tencent.mm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.Toast;
import com.tencent.mm.c.a.ea;
import com.tencent.mm.model.at;
import com.tencent.mm.model.av;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.q.aa;
import com.tencent.mm.q.r;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.account.SimpleLoginUI;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.contact.bb;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import java.util.ArrayList;
import java.util.LinkedList;

public class CheckCanSubscribeBizUI extends MMActivity
  implements com.tencent.mm.o.m, al, as
{
  private int aRG;
  private String appId;
  private int cCn;
  private String cIM;
  private String cIp;
  private String extInfo;
  private int fromScene;
  private boolean gFc = false;
  private String hfH;
  private int iIc;
  private LinkedList iId;
  private boolean iIe = false;
  private boolean iIf = false;
  private boolean iIg = false;
  private boolean iIh = false;
  private String iIi;
  private int iIj = 0;

  private void aOA()
  {
    Toast.makeText(this, getString(n.cnG), 1).show();
    aOC();
  }

  private void aOB()
  {
    Toast.makeText(this, n.bYW, 1).show();
    aOC();
  }

  private void aOC()
  {
    if (this.aRG == 1)
      LauncherUI.cf(this);
  }

  private boolean aOx()
  {
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      z.e("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "intent is null.");
      return false;
    }
    this.appId = localIntent.getStringExtra("appId");
    this.cIM = localIntent.getStringExtra("toUserName");
    if (ch.jb(this.cIM))
    {
      z.e("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "toUserName is null.");
      return false;
    }
    this.extInfo = localIntent.getStringExtra("extInfo");
    this.aRG = localIntent.getIntExtra("source", -1);
    this.cCn = localIntent.getIntExtra("scene", 0);
    this.iIj = localIntent.getIntExtra("jump_profile_type", 0);
    switch (this.aRG)
    {
    default:
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(this.aRG);
      z.e("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "source(%d) is invalidated.", arrayOfObject2);
      return false;
    case 1:
      if (ch.jb(this.appId))
      {
        z.e("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "appId is null.");
        return false;
      }
      this.fromScene = 68;
      ArrayList localArrayList = localIntent.getStringArrayListExtra("androidPackNameList");
      if ((localArrayList == null) || (localArrayList.size() == 0))
      {
        z.e("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "androidPackNameList is null or nil.");
        return false;
      }
      this.iId = new LinkedList();
      for (int i = 0; i < localArrayList.size(); i++)
      {
        String str = (String)localArrayList.get(i);
        if (!ch.jb(str))
        {
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = Integer.valueOf(i);
          arrayOfObject1[1] = str;
          z.i("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "packName(%d) : %s", arrayOfObject1);
          this.iId.add(ai.iU(str));
        }
      }
      if (this.iId.size() == 0)
      {
        z.e("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "androidPackNameList is nil.");
        return false;
      }
      this.iIc = this.iId.size();
    case 2:
    }
    while (true)
    {
      this.cIp = localIntent.getStringExtra("fromURL");
      return true;
      this.fromScene = 69;
    }
  }

  private void aOy()
  {
    while (true)
    {
      try
      {
        z.i("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "dealSuccess..,canJump = " + this.iIe);
        if (this.cCn == 1)
        {
          Intent localIntent1 = new Intent();
          localIntent1.putExtra("rawUrl", this.iIi);
          com.tencent.mm.am.a.b(this, "webview", ".ui.tools.WebViewUI", localIntent1);
          finish();
          return;
        }
        if ((this.cCn != 0) || (this.iIj != 1))
          break label149;
        if (this.iIg)
        {
          z.i("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "has jump ignore this scene");
          continue;
        }
      }
      finally
      {
      }
      this.iIg = true;
      bg.qX().a(233, this);
      com.tencent.mm.modelsimple.x localx = new com.tencent.mm.modelsimple.x(this.extInfo, null, 4, 0);
      bg.qX().d(localx);
      continue;
      label149: if ((aOz()) && (this.iIe))
      {
        if (!this.iIg)
        {
          z.i("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "jump to ChattingUI");
          Intent localIntent3 = new Intent().putExtra("Chat_User", this.cIM);
          localIntent3.putExtra("finish_direct", true);
          if (ch.jb(this.cIM))
            bb.c(localIntent3, this.cIM);
          localIntent3.setClass(this, ChattingUI.class);
          if (!this.iIf)
          {
            setResult(-1);
            this.iIg = true;
            startActivity(localIntent3);
            finish();
          }
        }
      }
      else if ((this.iIe) && (!this.iIg))
      {
        z.i("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "jump to ContactInfoUI");
        i locali = bg.qW().oT().ys(this.cIM);
        Intent localIntent2 = new Intent(this, ContactInfoUI.class);
        localIntent2.putExtra("Contact_Scene", this.fromScene);
        localIntent2.putExtra("Verify_ticket", this.hfH);
        if (locali != null)
        {
          localIntent2.putExtra("Contact_Alias", locali.iS());
          localIntent2.putExtra("Contact_Nick", locali.iV());
          localIntent2.putExtra("Contact_Signature", locali.jo());
          localIntent2.putExtra("Contact_RegionCode", locali.jz());
          localIntent2.putExtra("Contact_Sex", locali.jj());
          localIntent2.putExtra("Contact_VUser_Info", locali.ju());
          localIntent2.putExtra("Contact_VUser_Info_Flag", locali.jd());
          localIntent2.putExtra("Contact_KWeibo_flag", locali.je());
          localIntent2.putExtra("Contact_KWeibo", locali.jt());
          localIntent2.putExtra("Contact_KWeiboNick", locali.jf());
        }
        bb.b(localIntent2, this.cIM);
        if (!this.iIf)
        {
          setResult(-1);
          this.iIg = true;
          startActivity(localIntent2);
          finish();
        }
      }
    }
  }

  private boolean aOz()
  {
    boolean bool1 = false;
    label257: 
    while (true)
    {
      i locali;
      int i;
      try
      {
        locali = bg.qW().oT().ys(this.cIM);
        if (locali != null)
          break label257;
        z.w("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "contact is null.");
        i = 1;
        com.tencent.mm.q.a locala = null;
        if (i == 0)
          locala = r.fE(this.cIM);
        if ((locala == null) || (locala.ub()))
        {
          z.e("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "BizInfo(" + locala + ") is null or should update.");
          i = 1;
        }
        if (this.iIh)
        {
          if (locali == null)
          {
            this.iIe = false;
            setResult(5);
            aOB();
            finish();
            return bool1;
          }
          this.iIe = true;
          this.gFc = true;
          boolean bool2 = com.tencent.mm.g.a.cv(locali.getType());
          bool1 = false;
          if (!bool2)
            continue;
          this.iIe = true;
          this.gFc = true;
          bool1 = true;
          continue;
        }
        if (i == 0)
          break label229;
        if (this.iIe)
        {
          setResult(5);
          aOB();
          finish();
          bool1 = false;
          continue;
        }
      }
      finally
      {
      }
      at.qx().a(this.cIM, new l(this));
      bool1 = false;
      continue;
      label229: if (!com.tencent.mm.g.a.cv(locali.getType()))
      {
        z.w("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "is not contact.");
        this.iIe = true;
        bool1 = false;
        continue;
        i = 0;
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.d("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (paramx.getType() == 605)
    {
      com.tencent.mm.v.k localk = (com.tencent.mm.v.k)paramx;
      this.hfH = localk.xu();
      if ((paramInt1 == 0) && (paramInt2 == 0) && (localk.xt()))
      {
        this.cIM = localk.xv();
        this.iIi = localk.xw();
        aOy();
      }
    }
    com.tencent.mm.modelsimple.x localx;
    int i;
    do
    {
      return;
      if (dy.a(this, paramInt1, paramInt2, paramString, 7))
      {
        setResult(5);
        finish();
        return;
      }
      aOA();
      setResult(3);
      finish();
      return;
      if (paramx.getType() != 233)
        break label308;
      bg.qX().b(233, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break;
      localx = (com.tencent.mm.modelsimple.x)paramx;
      i = localx.zp();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(i);
      z.i("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "geta8key, action code = %d", arrayOfObject2);
    }
    while (i != 15);
    String str = localx.zn();
    Object[] arrayOfObject3 = new Object[2];
    arrayOfObject3[0] = Integer.valueOf(i);
    arrayOfObject3[1] = str;
    z.d("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "actionCode = %s, url = %s", arrayOfObject3);
    ea localea = new ea();
    localea.cJQ.cJS = i;
    localea.cJQ.cJT = str;
    localea.cJQ.context = this;
    com.tencent.mm.sdk.c.a.aGB().a(localea, Looper.myLooper());
    finish();
    return;
    aOA();
    return;
    label308: Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramx.getType());
    z.e("!44@/B4Tb64lLpKI+ZbHiEoPsk2SzqNNPitzPtV/pCqqwzc=", "un support scene type : %d", arrayOfObject1);
  }

  public final void a(int paramInt, ap paramap, Object paramObject)
  {
    a((String)paramObject, null);
  }

  public final void a(String paramString, ao paramao)
  {
    new cm().post(new m(this, paramString));
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bgU;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    aPP();
    if ((!bg.ra()) || (bg.rd()))
    {
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent());
      finish();
      return;
    }
    bg.qX().a(605, this);
    bg.qW().oT().a(this);
    aa.uY().g(this);
    if (aOx())
    {
      String str1 = this.appId;
      String str2 = this.cIM;
      String str3 = this.extInfo;
      int i = this.iIc;
      LinkedList localLinkedList = this.iId;
      String str4 = this.cIp;
      int j = this.aRG;
      int k = this.cCn;
      bg.qX().d(new com.tencent.mm.v.k(str1, str2, str3, i, localLinkedList, str4, j, k));
      return;
    }
    setResult(2);
    aOB();
    finish();
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if (this.iId != null)
      this.iId.clear();
    if (bg.oE())
    {
      bg.qX().b(605, this);
      aa.uY().h(this);
      bg.qW().oT().b(this);
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      this.iIf = true;
      if (this.iIg)
        return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
  }

  public void onStart()
  {
    super.onStart();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.CheckCanSubscribeBizUI
 * JD-Core Version:    0.6.2
 */