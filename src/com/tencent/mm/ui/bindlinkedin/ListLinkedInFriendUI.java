package com.tencent.mm.ui.bindlinkedin;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import com.tencent.mm.aa.d;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.bi;
import com.tencent.mm.modelfriend.bj;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.pluginsdk.ui.applet.a;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public class ListLinkedInFriendUI extends MMActivity
  implements m, af
{
  private boolean IF = false;
  private int cCn = 0;
  private int dSt = 0;
  private ListView fRC = null;
  private ab jjI = null;
  private boolean jjJ = false;
  private boolean jjK = false;
  private d jjL = null;
  private Dialog jjs = null;

  private void aUc()
  {
    if (this.jjJ)
    {
      this.jjL = new d(this.cCn, this.dSt);
      this.jjs = com.tencent.mm.ui.base.e.a(this, getString(n.aAy), false, new am(this));
      bg.qX().d(this.jjL);
      this.jjJ = false;
    }
  }

  protected final void DP()
  {
    this.fRC = ((ListView)findViewById(i.aAd));
    this.cCn = getIntent().getIntExtra("KScene", 0);
    this.jjI = new ab(this, com.tencent.mm.model.x.pG());
    this.jjI.a(this);
    this.fRC.setAdapter(this.jjI);
    this.fRC.setOnScrollListener(new ah(this));
    a(new ak(this));
    this.fRC.setOnItemClickListener(new al(this));
    this.jjJ = true;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    if ((paramInt2 != 5) && (this.jjs != null))
    {
      this.jjs.dismiss();
      this.jjs = null;
    }
    this.jjK = false;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      z.d("!44@/B4Tb64lLpJ4FHnyJpFGLC6Xej9PxJXB86Z93mHPIZQ=", "[oneliang][onSceneEnd]:ok");
      this.IF = ((d)paramx).hasNext();
      this.dSt = ((d)paramx).CJ();
      if (this.jjI != null)
        this.jjI.DW();
      return;
    }
    if (paramInt2 == 2)
    {
      this.jjs = com.tencent.mm.ui.base.e.a(this, true, getString(n.cDv), "", getString(n.cDs), getString(n.cDt), new ao(this), new ap(this));
      return;
    }
    if (paramInt2 == 5)
    {
      new ay(new aq(this), false).cP(2000L);
      return;
    }
    this.jjs = com.tencent.mm.ui.base.e.a(this, true, getString(n.cDu), "", getString(n.cDw), getString(n.cDt), new ar(this), new ai(this));
  }

  public final void bj(int paramInt1, int paramInt2)
  {
    if (this.jjI == null);
    String str1;
    do
    {
      bi localbi;
      do
      {
        return;
        localbi = (bi)this.jjI.getItem(paramInt1);
      }
      while (localbi == null);
      str1 = localbi.field_linkedInId;
      switch (localbi.field_status)
      {
      default:
        return;
      case 1:
        a locala = new a(this, new aj(this));
        locala.vw(str1);
        locala.aAI();
        LinkedList localLinkedList = new LinkedList();
        localLinkedList.add(Integer.valueOf(76));
        locala.f(localbi.field_wechatUsername, localLinkedList);
        localbi.field_userOpStatus = 1;
        az.CG().jn(str1);
        this.jjI.DW();
        return;
      case 2:
      }
    }
    while (paramInt2 != 1);
    Intent localIntent = new Intent(this, InviteLinkedInFriendUI.class);
    localIntent.putExtra("intent.key.linkedin.id", str1);
    Object localObject = bg.qW().oQ().get(286722);
    String str2 = com.tencent.mm.model.x.pI();
    if (localObject != null)
      str2 = localObject.toString();
    localIntent.putExtra("intent.key.linkedin.from.name", str2);
    startActivity(localIntent);
  }

  protected final int getLayoutId()
  {
    return k.bha;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    z.d("!44@/B4Tb64lLpJ4FHnyJpFGLC6Xej9PxJXB86Z93mHPIZQ=", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    if (paramIntent == null)
    {
      finish();
      return;
    }
    switch (paramInt1)
    {
    default:
      z.e("!44@/B4Tb64lLpJ4FHnyJpFGLC6Xej9PxJXB86Z93mHPIZQ=", "onActivityResult unknow request");
      return;
    case 100:
    }
    Bundle localBundle = paramIntent.getBundleExtra("result_data");
    String str1 = localBundle.getString("ret");
    String str2 = localBundle.getString("limid");
    String str3 = localBundle.getString("liname");
    String str4 = localBundle.getString("liurl");
    String str5 = localBundle.getString("liswitch");
    if (ch.jb(str1))
    {
      z.e("!44@/B4Tb64lLpJ4FHnyJpFGLC6Xej9PxJXB86Z93mHPIZQ=", "linkedin oauth ret is null, maybe canceled");
      return;
    }
    int i = ch.xy(str1);
    if (i != 0)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      z.e("!44@/B4Tb64lLpJ4FHnyJpFGLC6Xej9PxJXB86Z93mHPIZQ=", "linkedin oauth bind failed ret %s ", arrayOfObject);
      if (i == 1);
      for (int j = n.bBU; ; j = n.bBT)
      {
        com.tencent.mm.ui.base.e.a(this, getString(j), "", new an(this));
        this.jjJ = false;
        return;
      }
    }
    this.jjJ = true;
    if (ch.jb(str2))
    {
      z.e("!44@/B4Tb64lLpJ4FHnyJpFGLC6Xej9PxJXB86Z93mHPIZQ=", "linkedin member id is null");
      return;
    }
    z.d("!44@/B4Tb64lLpJ4FHnyJpFGLC6Xej9PxJXB86Z93mHPIZQ=", "%s, %s, %s, %s", new Object[] { str2, str3, str4, str5 });
    bg.qW().oQ().set(286722, str3);
    bg.qW().oQ().set(286721, str2);
    bg.qW().oQ().set(286723, str4);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.cDh);
    DP();
  }

  protected void onDestroy()
  {
    super.onDestroy();
    this.jjI.aUb();
  }

  protected void onPause()
  {
    bg.qX().b(676, this);
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
    bg.qX().a(676, this);
    if (this.jjI != null)
      this.jjI.DW();
    aUc();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.ListLinkedInFriendUI
 * JD-Core Version:    0.6.2
 */