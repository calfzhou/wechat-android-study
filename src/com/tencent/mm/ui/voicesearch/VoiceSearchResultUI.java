package com.tencent.mm.ui.voicesearch;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.am.a;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.contact.bb;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VoiceSearchResultUI extends MMActivity
{
  private int cCB = 1;
  private int dAk = 2;
  private TextView ewu;
  private j jZH;
  private String[] jZI;
  private int jZJ = -1;
  private boolean jZK = false;
  private ListView jZu;
  private String jZw = null;

  private static String[] C(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      return paramArrayOfString;
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSL2bHGvRI18mEYwKXSwUqfk=", "oldlist.length " + paramArrayOfString.length);
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str1 = paramArrayOfString[j];
      String str2 = y.dh(str1);
      z.d("!44@/B4Tb64lLpKCGRi+LcyHSL2bHGvRI18mEYwKXSwUqfk=", "displayname " + str2);
      if ((!localHashMap.containsValue(str2)) || (!y.dc(str1)))
      {
        z.d("!44@/B4Tb64lLpKCGRi+LcyHSL2bHGvRI18mEYwKXSwUqfk=", "username " + str1);
        localHashMap.put(str2, str1);
        localArrayList.add(str1);
      }
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }

  private void D(String[] paramArrayOfString)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramArrayOfString != null) && (this.jZH != null))
    {
      int i = paramArrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        String str = paramArrayOfString[j];
        if (this.jZH.Dz(str))
          localArrayList.add(str);
      }
    }
    if (localArrayList.size() == 0)
    {
      this.ewu.setVisibility(0);
      if (this.jZw != null)
        this.ewu.setText(this.jZw);
    }
    while (true)
    {
      if (this.jZH != null)
        this.jZH.bn(localArrayList);
      return;
      this.ewu.setText(getString(com.tencent.mm.n.bsf));
      continue;
      this.ewu.setVisibility(8);
    }
  }

  private static boolean DA(String paramString)
  {
    Cursor[] arrayOfCursor = new Cursor[2];
    arrayOfCursor[0] = bg.qW().oW().b(y.dkj, null, paramString);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    try
    {
      while (arrayOfCursor[0].moveToNext())
      {
        String str = arrayOfCursor[0].getString(arrayOfCursor[0].getColumnIndex("username"));
        localArrayList1.add(str);
        if (!str.endsWith("@chatroom"))
          localArrayList2.add(str);
        z.d("!44@/B4Tb64lLpKCGRi+LcyHSL2bHGvRI18mEYwKXSwUqfk=", "block user " + str);
      }
    }
    catch (Exception localException)
    {
      arrayOfCursor[1] = bg.qW().oT().b(paramString, "@micromsg.with.all.biz.qq.com", localArrayList1, localArrayList2);
      int i = arrayOfCursor[1].getCount();
      int j = arrayOfCursor[0].getCount();
      arrayOfCursor[0].close();
      arrayOfCursor[1].close();
      z.d("!44@/B4Tb64lLpKCGRi+LcyHSL2bHGvRI18mEYwKXSwUqfk=", "contactCount " + i + " conversationCount " + j);
      if (i + j <= 1)
        return true;
    }
    return false;
  }

  protected final void DP()
  {
    this.jZu = ((ListView)findViewById(i.aWf));
    this.ewu = ((TextView)findViewById(i.arK));
    this.jZI = getIntent().getStringArrayExtra("VoiceSearchResultUI_Resultlist");
    this.jZw = getIntent().getStringExtra("VoiceSearchResultUI_Error");
    this.jZJ = getIntent().getIntExtra("VoiceSearchResultUI_VoiceId", -1);
    this.cCB = getIntent().getIntExtra("VoiceSearchResultUI_ShowType", 1);
    int i;
    LinkedList localLinkedList;
    if (this.cCB == 1)
    {
      i = 2;
      this.dAk = i;
      this.jZH = new j(getApplicationContext(), this.cCB);
      this.jZH.gn(false);
      localLinkedList = new LinkedList();
      switch (this.cCB)
      {
      case 1:
      default:
        label160: if (this.jZH != null)
          this.jZH.bc(localLinkedList);
        this.jZu.setAdapter(this.jZH);
        this.ewu.setVisibility(8);
        z.d("!44@/B4Tb64lLpKCGRi+LcyHSL2bHGvRI18mEYwKXSwUqfk=", "voiceId  " + this.jZJ);
        if (this.cCB == 2)
        {
          Bt("");
          this.jZI = C(this.jZI);
        }
        break;
      case 2:
      }
    }
    while (true)
    {
      Bt(getString(com.tencent.mm.n.bpe));
      a(new w(this));
      this.jZu.setOnItemClickListener(new x(this));
      D(this.jZI);
      return;
      i = 1;
      break;
      localLinkedList.add("lbsapp");
      localLinkedList.add("shakeapp");
      localLinkedList.add("qqfriend");
      localLinkedList.add("facebookapp");
      localLinkedList.add("feedsapp");
      localLinkedList.add("fmessage");
      localLinkedList.add("voipapp");
      localLinkedList.add("voicevoipapp");
      localLinkedList.add("voiceinputapp");
      localLinkedList.add("linkedinplugin");
      int j = com.tencent.mm.model.x.pO();
      if ((j & 0x1) != 0)
        localLinkedList.add("qqmail");
      if ((!y.qp()) || ((j & 0x2) != 0))
        localLinkedList.add("tmessage");
      if ((j & 0x20) != 0)
        localLinkedList.add("qmessage");
      if ((j & 0x80) != 0)
        localLinkedList.add("qqsync");
      if ((j & 0x10) != 0)
        localLinkedList.add("medianote");
      if ((0x80000 & j) != 0)
        localLinkedList.add("newsapp");
      if (((0x40000 & j) != 0) || (!y.qo()))
        localLinkedList.add("blogapp");
      if ((0x10000 & j) != 0)
        localLinkedList.add("masssendapp");
      if ((j & 0x2000000) == 0)
        break label160;
      localLinkedList.add("voiceinputapp");
      break label160;
      Bt(getString(com.tencent.mm.n.bpe));
    }
  }

  public final void bO(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() <= 0));
    do
    {
      Intent localIntent2;
      do
      {
        return;
        z.d("!44@/B4Tb64lLpKCGRi+LcyHSL2bHGvRI18mEYwKXSwUqfk=", "dealSelectContact " + paramString1);
        if (this.cCB == 3)
        {
          Intent localIntent1 = new Intent();
          localIntent1.putExtra("Select_Conv_User", paramString1);
          setResult(-1, localIntent1);
          finish();
          return;
        }
        if ((this.cCB != 1) && (!y.dQ(paramString1)) && (!y.dj(paramString1)) && (!y.dc(paramString1)) && (!y.de(paramString1)) && (!DA(paramString2)))
          break label920;
        if (this.cCB != 1)
          break;
        localIntent2 = new Intent();
        localIntent2.setClass(this, ContactInfoUI.class);
        localIntent2.putExtra("Contact_User", paramString1);
        if (y.de(paramString1))
          localIntent2.putExtra("Is_group_card", true);
      }
      while ((paramString1 == null) || (paramString1.length() <= 0));
      bb.c(localIntent2, paramString1);
      startActivity(localIntent2);
      return;
    }
    while (this.cCB != 2);
    if (ch.jb(paramString1))
    {
      z.e("!44@/B4Tb64lLpKCGRi+LcyHSL2bHGvRI18mEYwKXSwUqfk=", "username is null " + paramString1);
      return;
    }
    if (y.dn(paramString1))
    {
      if (com.tencent.mm.model.x.pU())
      {
        Intent localIntent6 = new Intent().putExtra("finish_direct", true);
        a.b(aPI(), "tmessage", ".ui.TConversationUI", localIntent6);
        return;
      }
      startActivity(new Intent(this, ContactInfoUI.class).putExtra("Contact_User", paramString1));
      return;
    }
    if (y.dp(paramString1))
    {
      if (com.tencent.mm.model.x.pR())
      {
        Intent localIntent5 = new Intent().putExtra("finish_direct", true);
        a.b(aPI(), "qmessage", ".ui.QConversationUI", localIntent5);
        return;
      }
      startActivity(new Intent(this, ContactInfoUI.class).putExtra("Contact_User", paramString1));
      return;
    }
    if (y.jdMethod_do(paramString1))
    {
      startActivity(new Intent(this, ContactInfoUI.class).putExtra("Contact_User", paramString1));
      return;
    }
    if (y.dt(paramString1))
    {
      MMAppMgr.cb(paramString1);
      if (com.tencent.mm.model.x.pW())
      {
        a.b(this, "qqsync", ".ui.QQSyncUI", new Intent().putExtra("finish_direct", true));
        return;
      }
      startActivity(new Intent(this, ContactInfoUI.class).putExtra("Contact_User", paramString1));
      return;
    }
    if (y.dl(paramString1))
    {
      if (com.tencent.mm.model.x.qd())
      {
        a(ChattingUI.class, new Intent().putExtra("Chat_User", paramString1).putExtra("finish_direct", true));
        return;
      }
      startActivity(new Intent(this, ContactInfoUI.class).putExtra("Contact_User", paramString1));
      return;
    }
    if (y.dy(paramString1))
    {
      if (com.tencent.mm.model.x.pY())
      {
        Intent localIntent4 = new Intent();
        localIntent4.putExtra("type", 20);
        a.b(this, "readerapp", ".ui.ReaderAppUI", localIntent4);
        return;
      }
      startActivity(new Intent(this, ContactInfoUI.class).putExtra("Contact_User", paramString1));
      return;
    }
    if (y.dF(paramString1))
    {
      if (com.tencent.mm.model.x.pZ())
      {
        Intent localIntent3 = new Intent();
        localIntent3.putExtra("type", 11);
        a.b(this, "readerapp", ".ui.ReaderAppUI", localIntent3);
        return;
      }
      startActivity(new Intent(this, ContactInfoUI.class).putExtra("Contact_User", paramString1));
      return;
    }
    if (y.dq(paramString1))
    {
      startActivity(new Intent(this, ContactInfoUI.class).putExtra("Contact_User", paramString1));
      return;
    }
    if (y.dr(paramString1))
    {
      if (com.tencent.mm.model.x.qb())
      {
        a.b(this, "masssend", ".ui.MassSendHistoryUI", new Intent().putExtra("finish_direct", true));
        return;
      }
      startActivity(new Intent(this, ContactInfoUI.class).putExtra("Contact_User", paramString1));
      return;
    }
    if (y.dx(paramString1))
    {
      if (com.tencent.mm.model.x.pV())
      {
        a(ChattingUI.class, new Intent().putExtra("Chat_User", paramString1).putExtra("finish_direct", true));
        return;
      }
      startActivity(new Intent(this, ContactInfoUI.class).putExtra("Contact_User", paramString1));
      return;
    }
    if ((y.dv(paramString1)) || (y.dw(paramString1)) || (y.ds(paramString1)) || (y.dz(paramString1)) || (y.dA(paramString1)) || (y.dm(paramString1)) || (y.dI(paramString1)))
    {
      startActivity(new Intent(this, ContactInfoUI.class).putExtra("Contact_User", paramString1));
      return;
    }
    a(ChattingUI.class, new Intent().putExtra("Chat_User", paramString1).putExtra("finish_direct", true));
    return;
    label920: Intent localIntent7 = new Intent(this, SearchConversationResultUI.class);
    localIntent7.putExtra("SearchConversationResult_User", paramString2);
    startActivity(localIntent7);
  }

  protected final int getLayoutId()
  {
    return k.bpe;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
    this.jZK = false;
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.jZH.closeCursor();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    com.tencent.mm.plugin.f.c.n localn;
    StringBuilder localStringBuilder;
    if ((4 == paramInt) && (!this.jZK))
    {
      localn = com.tencent.mm.plugin.f.c.n.fTF;
      localStringBuilder = new StringBuilder().append(this.dAk).append(",").append(this.jZJ).append(",");
      if (this.jZI != null)
        break label91;
    }
    label91: for (int i = 0; ; i = this.jZI.length)
    {
      localn.q(10452, i + ",0");
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
  }

  public void onPause()
  {
    super.onPause();
    this.jZK = true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.VoiceSearchResultUI
 * JD-Core Version:    0.6.2
 */