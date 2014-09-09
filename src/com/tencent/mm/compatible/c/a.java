package com.tencent.mm.compatible.c;

import com.tencent.mm.sdk.platformtools.z;

public final class a
{
  public int dLB;
  public int dLC;
  public int dLD;
  public int dLE;
  public int dLF;
  public boolean dLG;
  public int dLH;
  public int dLI;
  public int dLJ;
  public int dLK;
  public int dLM;
  public int dLN;
  public int dLO;
  public int dLP;
  public int dLQ;
  public int dLR;
  public boolean dLc = false;
  public int dLd;
  public int dLe;
  public int dLf;
  public int dLg;
  public int dLh;
  public int dLi;
  public int dLj;
  public int dLk;
  public int dLl;
  public int dLm;
  public int dLn;
  public int dLo;
  public int dLp;
  public int dLq;
  public int dLr;
  public int dLs;
  public int dLt;
  public int dLu;
  public int dLv;
  public int dLw;
  public int dLx;
  public int dLy;
  public int dLz;

  public a()
  {
    reset();
  }

  public final void dump()
  {
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "streamtype " + this.dLd);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "smode " + this.dLe);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "omode " + this.dLf);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "ospeaker " + this.dLg);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "operating" + this.dLh);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "moperating" + this.dLi);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "mstreamtype" + this.dLj);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "mVoiceRecordMode" + this.dLk);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "agcMode :" + this.dLm);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "nsMode:" + this.dLo);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "aecMode:" + this.dLn);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "volumMode:" + this.dLp);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "micMode:" + this.dLy);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "sourceMode:" + this.dLz);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "speakerMode:" + this.dLB);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "phoneMode:" + this.dLC);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "voipstreamType:" + this.dLD);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "speakerstreamtype:" + this.dLE);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "phonestreamtype:" + this.dLF);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "ringphonestream:" + this.dLH);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "ringphonemode:" + this.dLI);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "ringspeakerstream:" + this.dLJ);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "ringspeakermode:" + this.dLK);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "agcModeNew :" + this.dLO);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "nsModeNew:" + this.dLN);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "aecModeNew:" + this.dLM);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "agctargetdb:" + this.dLP);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "agcgaindb:" + this.dLQ);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "agcflag:" + this.dLR);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "inputVolumeScale:" + this.dLq);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "outputVolumeScale:" + this.dLr);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "inputVolumeScaleForSpeaker:" + this.dLs);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "outputVolumeScaleForSpeaker:" + this.dLt);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "ehanceHeadsetEC:" + this.dLu);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "setECModeLevelForHeadSet:" + this.dLv);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "setECModeLevelForSpeaker:" + this.dLw);
    z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "enableSpeakerEnhanceEC:" + this.dLx);
  }

  public final boolean mL()
  {
    return this.dLh >= 0;
  }

  public final boolean mM()
  {
    return this.dLi >= 0;
  }

  public final int mN()
  {
    int i;
    if (mL())
    {
      i = (0xE0 & this.dLh) >> 5;
      z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "getEnableMode " + i);
      if (i != 7);
    }
    else
    {
      return -1;
    }
    return i;
  }

  public final int mO()
  {
    int i;
    if (mL())
    {
      i = (0xE & this.dLh) >> 1;
      z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "getDisableMode " + i);
      if (i != 7);
    }
    else
    {
      return -1;
    }
    return i;
  }

  public final int mP()
  {
    int i;
    if (mM())
    {
      i = (0xE0 & this.dLi) >> 5;
      z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "getEnableMode " + i);
      if (i != 7);
    }
    else
    {
      return -1;
    }
    return i;
  }

  public final int mQ()
  {
    int i;
    if (mM())
    {
      i = (0xE & this.dLi) >> 1;
      z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", "getDisableMode " + i);
      if (i != 7);
    }
    else
    {
      return -1;
    }
    return i;
  }

  public final void reset()
  {
    this.dLc = false;
    this.dLd = -1;
    this.dLe = -1;
    this.dLf = -1;
    this.dLg = -1;
    this.dLh = -1;
    this.dLi = -1;
    this.dLj = -1;
    this.dLl = -1;
    this.dLk = -1;
    this.dLm = -1;
    this.dLn = -1;
    this.dLo = -1;
    this.dLp = -1;
    this.dLy = -1;
    this.dLz = -1;
    this.dLB = -1;
    this.dLC = -1;
    this.dLD = -1;
    this.dLE = -1;
    this.dLF = -1;
    this.dLG = false;
    this.dLH = -1;
    this.dLI = -1;
    this.dLK = -1;
    this.dLJ = -1;
    this.dLO = -1;
    this.dLM = -1;
    this.dLN = -1;
    this.dLP = -1;
    this.dLQ = -1;
    this.dLR = -1;
    this.dLq = -1;
    this.dLr = -1;
    this.dLs = -1;
    this.dLt = -1;
    this.dLu = -1;
    this.dLv = -1;
    this.dLw = -1;
    this.dLx = -1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.c.a
 * JD-Core Version:    0.6.2
 */