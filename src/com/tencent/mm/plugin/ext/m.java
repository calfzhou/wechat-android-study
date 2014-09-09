package com.tencent.mm.plugin.ext;

import com.tencent.mm.c.a.bj;
import com.tencent.mm.c.a.bk;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;

public final class m extends g
{
  t eLH;
  q eLI;
  p eLJ;
  s eLK;
  r eLL;
  o eLM;
  n eLN;

  public m()
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    int i = 1;
    if (!(parame instanceof bj))
    {
      z.f("!44@/B4Tb64lLpIAhUt0Bg2QThuc37pqTsjLtAkd+Z5MTHc=", "mismatched event");
      i = 0;
    }
    do
    {
      bj localbj;
      do
      {
        return i;
        localbj = (bj)parame;
        if (localbj.cIl.op == i)
        {
          z.e("!44@/B4Tb64lLpIAhUt0Bg2QThuc37pqTsjLtAkd+Z5MTHc=", "ExtAgentLifeEventListener init");
          this.eLH = new t();
          this.eLI = new q();
          this.eLJ = new p();
          this.eLK = new s();
          this.eLL = new r();
          this.eLM = new o();
          this.eLN = new n();
          a.aGB().a("ExtRequestAccountSync", this.eLH);
          a.aGB().a("ExtRecord", this.eLI);
          a.aGB().a("ExtPlayer", this.eLJ);
          a.aGB().a("ExtVoiceMsgIdToFileName", this.eLK);
          a.aGB().a("ExtVoiceFileNameToMsgId", this.eLL);
          a.aGB().a("ExtNetSceneSendMsg", this.eLM);
          a.aGB().a("ExtCursorForTimeLine", this.eLN);
          return i;
        }
      }
      while (localbj.cIl.op != 2);
      if (this.eLH != null)
        a.aGB().b("ExtRequestAccountSync", this.eLH);
      if (this.eLI != null)
        a.aGB().b("ExtRecord", this.eLI);
      if (this.eLJ != null)
        a.aGB().b("ExtPlayer", this.eLJ);
      if (this.eLK != null)
        a.aGB().b("ExtVoiceMsgIdToFileName", this.eLK);
      if (this.eLL != null)
        a.aGB().b("ExtVoiceFileNameToMsgId", this.eLL);
      if (this.eLM != null)
        a.aGB().b("ExtNetSceneSendMsg", this.eLM);
    }
    while (this.eLN == null);
    a.aGB().b("ExtCursorForTimeLine", this.eLN);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.m
 * JD-Core Version:    0.6.2
 */