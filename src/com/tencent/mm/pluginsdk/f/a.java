package com.tencent.mm.pluginsdk.f;

public final class a
{
  public int dGd;
  public int dMp;
  public int hwA;
  public int hwB;
  public String hwC;
  public String hwD;
  public String hwE;
  public String hwF;
  public String hwG;
  public int hwH;
  public int hwI;
  public int hwv;
  public int hww;
  public int hwx;
  public int hwy;
  public int hwz;
  public int tj;

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("fps=").append(this.tj).append('\n');
    localStringBuilder.append("width=").append(this.hww).append('\n');
    localStringBuilder.append("height=").append(this.hwv).append('\n');
    localStringBuilder.append("bitrate=").append(this.hwx).append('\n');
    localStringBuilder.append("rotate=").append(this.dMp).append('\n');
    localStringBuilder.append("yuvWidth=").append(this.hwz).append('\n');
    localStringBuilder.append("yuvHeight=").append(this.hwy).append('\n');
    localStringBuilder.append("x264Speed=").append(this.hwA).append('\n');
    localStringBuilder.append("x264Quality=").append(this.hwB).append('\n');
    localStringBuilder.append("yuvFile=").append(this.hwC).append('\n');
    localStringBuilder.append("pcmFile=").append(this.hwD).append('\n');
    localStringBuilder.append("thuFile=").append(this.hwE).append('\n');
    localStringBuilder.append("x264File=").append(this.hwF).append('\n');
    localStringBuilder.append("mp4File=").append(this.hwG).append('\n');
    localStringBuilder.append("videoFrameCnt=").append(this.hwH).append('\n');
    localStringBuilder.append("videoLength=").append(this.dGd).append('\n');
    localStringBuilder.append("cameraCount=").append(this.hwI).append('\n');
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.a
 * JD-Core Version:    0.6.2
 */