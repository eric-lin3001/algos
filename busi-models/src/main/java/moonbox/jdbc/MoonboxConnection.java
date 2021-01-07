//package moonbox.jdbc;
//
//import java.sql.Array;
//import java.sql.Blob;
//import java.sql.CallableStatement;
//import java.sql.Clob;
//import java.sql.Connection;
//import java.sql.DatabaseMetaData;
//import java.sql.NClob;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.SQLWarning;
//import java.sql.SQLXML;
//import java.sql.Savepoint;
//import java.sql.Statement;
//import java.sql.Struct;
//import java.util.Map;
//import java.util.Properties;
//import java.util.concurrent.Executor;
//import moonbox.client.ClientOptions;
//import moonbox.client.ClientOptions$;
//import moonbox.client.MoonboxClient;
//import moonbox.client.MoonboxClient$;
//import scala.Function1;
//import scala.MatchError;
//import scala.Option$;
//import scala.Predef$;
//import scala.Serializable;
//import scala.Tuple2;
//import scala.collection.IterableLike;
//import scala.collection.JavaConverters$;
//import scala.collection.Seq$;
//import scala.collection.TraversableOnce;
//import scala.collection.immutable.StringOps;
//import scala.reflect.ScalaSignature;
//import scala.runtime.AbstractFunction1;
//import scala.runtime.BoxesRunTime;
//
//@ScalaSignature(bytes = "\006\001\r=c\001B\001\003\001\035\021\021#T8p]\n|\007pQ8o]\026\034G/[8o\025\t\031A!\001\003kI\n\034'\"A\003\002\0175|wN\0342pq\016\0011c\001\001\t!A\021\021BD\007\002\025)\0211\002D\001\005Y\006twMC\001\016\003\021Q\027M^1\n\005=Q!AB(cU\026\034G\017\005\002\022)5\t!C\003\002\024\031\005\0311/\0357\n\005U\021\"AC\"p]:,7\r^5p]\"Aq\003\001B\001B\003%\001$A\002ve2\004\"!G\020\017\005iiR\"A\016\013\003q\tQa]2bY\006L!AH\016\002\rA\023X\rZ3g\023\t\001\023E\001\004TiJLgn\032\006\003=mA\001b\t\001\003\002\003\006I\001J\001\006aJ|\007o\035\t\003K!j\021A\n\006\003O1\tA!\036;jY&\021\021F\n\002\013!J|\007/\032:uS\026\034\b\"B\026\001\t\003a\023A\002\037j]&$h\bF\002._A\002\"A\f\001\016\003\tAQa\006\026A\002aAQa\t\026A\002\021B\021B\r\001A\002\003\007I\021B\032\002\027)$'mY*fgNLwN\\\013\002iA\021a&N\005\003m\t\0211B\0233cGN+7o]5p]\"I\001\b\001a\001\002\004%I!O\001\020U\022\0247mU3tg&|gn\030\023fcR\021!(\020\t\0035mJ!\001P\016\003\tUs\027\016\036\005\b}]\n\t\0211\0015\003\rAH%\r\005\007\001\002\001\013\025\002\033\002\031)$'mY*fgNLwN\034\021\t\023\t\003\001\031!a\001\n\023\031\025!C:uCR,W.\0328u+\005!\005C\001\030F\023\t1%A\001\tN_>t'm\034=Ti\006$X-\\3oi\"I\001\n\001a\001\002\004%I!S\001\016gR\fG/Z7f]R|F%Z9\025\005iR\005b\002 H\003\003\005\r\001\022\005\007\031\002\001\013\025\002#\002\025M$\030\r^3nK:$\b\005C\005O\001\001\007\t\031!C\005\037\0069\021n\035'pG\006dW#\001)\021\005i\t\026B\001*\034\005\035\021un\0347fC:D\021\002\026\001A\002\003\007I\021B+\002\027%\034Hj\\2bY~#S-\035\013\003uYCqAP*\002\002\003\007\001\013\003\004Y\001\001\006K\001U\001\tSNdunY1mA!I!\f\001a\001\002\004%IaT\001\n?J,\027\rZ(oYfD\021\002\030\001A\002\003\007I\021B/\002\033}\023X-\0313P]2Lx\fJ3r)\tQd\fC\004?7\006\005\t\031\001)\t\r\001\004\001\025)\003Q\003)y&/Z1e\037:d\027\020\t\005\006E\002!\taY\001\005S:LG\017F\001Q\021\025)\007\001\"\003g\003-Ig.\033;TKN\034\030n\0348\025\ti:w\016\036\005\006Q\022\004\r![\001\016[>|gNY8y\0072LWM\034;\021\005)lW\"A6\013\0051$\021AB2mS\026tG/\003\002oW\niQj\\8oE>D8\t\\5f]RDQ\001\0353A\002E\fQb\0317jK:$x\n\035;j_:\034\bC\0016s\023\t\0318NA\007DY&,g\016^(qi&|gn\035\005\006G\021\004\r\001\n\005\006m\002!\taM\001\013O\026$8+Z:tS>t\007\"\002=\001\t\003J\030AB2p[6LG\017F\001;\021\025Y\b\001\"\021}\00399W\r\036%pY\022\f'-\0337jif$\022! \t\0035yL!a`\016\003\007%sG\017C\004\002\004\001!\t%!\002\002\025M,GoQ1uC2|w\rF\002;\003\017Aq!!\003\002\002\001\007\001$A\004dCR\fGn\\4\t\017\0055\001\001\"\021\002\020\005q1/\032;I_2$\027MY5mSRLHc\001\036\002\022!9\0211CA\006\001\004i\030a\0035pY\022\f'-\0337jifDq!a\006\001\t\003\nI\"\001\tqe\026\004\030M]3Ti\006$X-\\3oiR!\0211DA\021!\r\t\022QD\005\004\003?\021\"!\005)sKB\f'/\0323Ti\006$X-\\3oi\"11#!\006A\002aAq!a\006\001\t\003\n)\003\006\005\002\034\005\035\022\021FA\027\021\031\031\0221\005a\0011!9\0211FA\022\001\004i\030!\004:fgVdGoU3u)f\004X\rC\004\0020\005\r\002\031A?\002)I,7/\0367u'\026$8i\0348dkJ\024XM\\2z\021\035\t9\002\001C!\003g!\"\"a\007\0026\005]\022\021HA\036\021\031\031\022\021\007a\0011!9\0211FA\031\001\004i\bbBA\030\003c\001\r! \005\b\003{\t\t\0041\001~\003Q\021Xm];miN+G\017S8mI\006\024\027\016\\5us\"9\021q\003\001\005B\005\005CCBA\016\003\007\n)\005\003\004\024\003\001\r\001\007\005\b\003\017\ny\0041\001~\003E\tW\017^8HK:,'/\031;fI.+\027p\035\005\b\003/\001A\021IA&)\031\tY\"!\024\002P!11#!\023A\002aA\001\"!\025\002J\001\007\0211K\001\016G>dW/\0348J]\022,\0070Z:\021\ti\t)&`\005\004\003/Z\"!B!se\006L\bbBA\f\001\021\005\0231\f\013\007\0037\ti&a\030\t\rM\tI\0061\001\031\021!\t\t'!\027A\002\005\r\024aC2pYVlgNT1nKN\004BAGA+1!9\021q\r\001\005B\005%\024AC2sK\006$Xm\0217pER\021\0211\016\t\004#\0055\024bAA8%\t!1\t\\8c\021\035\t\031\b\001C!\003k\n\021b]3u'\016DW-\\1\025\007i\n9\bC\004\002z\005E\004\031\001\r\002\rM\034\007.Z7b\021\035\ti\b\001C!\003\nQb]3u\0072LWM\034;J]\032|G#\002\036\002\002\006\025\005bBAB\003w\002\r\001G\001\005]\006lW\rC\004\002\b\006m\004\031\001\r\002\013Y\fG.^3\t\017\005u\004\001\"\021\002\fR\031!(!$\t\017\005=\025\021\022a\001I\005Q\001O]8qKJ$\030.Z:\t\017\005M\005\001\"\021\002\026\006a1M]3bi\026\034\026\013\024-N\031R\021\021q\023\t\004#\005e\025bAAN%\t11+\025'Y\0332Cq!a(\001\t\003\n\t+\001\006hKR\034\025\r^1m_\036$\022\001\007\005\b\003K\003A\021IAT\003)\031'/Z1uK\ncwN\031\013\003\003S\0032!EAV\023\r\tiK\005\002\005\0052|'\r\003\004\0022\002!\t!_\001\fG\",7m[\"m_N,G\rC\004\0026\002!\t%a.\002\037\r\024X-\031;f'R\fG/Z7f]R$\"!!/\021\007E\tY,C\002\002>J\021\021b\025;bi\026lWM\034;\t\017\005U\006\001\"\021\002BR1\021\021XAb\003\013Dq!a\013\002@\002\007Q\020C\004\0020\005}\006\031A?\t\017\005U\006\001\"\021\002JRA\021\021XAf\003\033\fy\rC\004\002,\005\035\007\031A?\t\017\005=\022q\031a\001{\"9\021QHAd\001\004i\bbBAj\001\021\005\023Q[\001\006C\n|'\017\036\013\004u\005]\007\002CAm\003#\004\r!a7\002\021\025DXmY;u_J\004B!!8\002d6\021\021q\034\006\004\003C4\023AC2p]\016,(O]3oi&!\021Q]Ap\005!)\0050Z2vi>\024\bbBAu\001\021\005\0231^\001\016g\026$\030)\036;p\007>lW.\033;\025\007i\ni\017C\004\002p\006\035\b\031\001)\002\025\005,Ho\\\"p[6LG\017C\004\002t\002!\t%!>\002\027\035,G/T3uC\022\013G/\031\013\003\003o\0042!EA}\023\r\tYP\005\002\021\t\006$\030MY1tK6+G/\031#bi\006Dq!a@\001\t\003\022\t!A\006tKR\024V-\0313P]2LHc\001\036\003\004!9!QAA\001\004\001\026\001\003:fC\022|e\016\\=\t\017\t%\001\001\"\021\003\f\005Y\001O]3qCJ,7)\0317m)\021\021iAa\005\021\007E\021y!C\002\003\022I\021\021cQ1mY\006\024G.Z*uCR,W.\0328u\021\031\031\"q\001a\0011!9!\021\002\001\005B\t]A\003\003B\007\0053\021YB!\b\t\rM\021)\0021\001\031\021\035\tYC!\006A\002uDq!a\f\003\026\001\007Q\020C\004\003\n\001!\tE!\t\025\025\t5!1\005B\023\005O\021I\003\003\004\024\005?\001\r\001\007\005\b\003W\021y\0021\001~\021\035\tyCa\bA\002uDq!!\020\003 \001\007Q\020C\004\003.\001!\tEa\f\002/M,G\017\026:b]N\f7\r^5p]&\033x\016\\1uS>tGc\001\036\0032!9!1\007B\026\001\004i\030!\0027fm\026d\007b\002B\034\001\021\005#\021H\001\fO\026$x+\031:oS:<7\017\006\002\003<A\031\021C!\020\n\007\t}\"C\001\006T#2;\026M\0358j]\036DqAa\021\001\t\003\022)%\001\tsK2,\027m]3TCZ,\007o\\5oiR\031!Ha\022\t\021\t%#\021\ta\001\005\027\n\021b]1wKB|\027N\034;\021\007E\021i%C\002\003PI\021\021bU1wKB|\027N\034;\t\017\tM\003\001\"\021\003V\005Ia.\031;jm\026\034\026\013\024\013\0041\t]\003BB\n\003R\001\007\001\004\003\004\003\\\001!\teY\001\013SN\024V-\0313P]2L\bb\002B0\001\021\005#\021M\001\016GJ,\027\r^3BeJ\f\027p\0244\025\r\t\r$q\rB6!\r\t\"QM\005\004\003/\022\002b\002B5\005;\002\r\001G\001\tif\004XMT1nK\"A!Q\016B/\001\004\021y'\001\005fY\026lWM\034;t!\025Q\022Q\013B9!\rQ\"1O\005\004\005kZ\"AB!osJ+g\rC\004\003z\001!\tEa\037\002\031M,GoU1wKB|\027N\034;\025\005\t-\003b\002B=\001\021\005#q\020\013\005\005\027\022\t\tC\004\002\004\nu\004\031\001\r\t\r\t\025\005\001\"\021z\003\025\031Gn\\:f\021\035\021I\t\001C!\005\027\0131b\031:fCR,gj\0217pER\021!Q\022\t\004#\t=\025b\001BI%\t)aj\0217pE\"1!Q\023\001\005Be\f\001B]8mY\n\f7m\033\005\b\005+\003A\021\tBM)\rQ$1\024\005\t\005\023\0229\n1\001\003L!9!q\024\001\005B\t\005\026!E:fi:+Go^8sWRKW.Z8viR)!Ha)\003&\"A\021\021\034BO\001\004\tY\016C\004\003(\nu\005\031A?\002\0315LG\016\\5tK\016|g\016Z:\t\017\t-\006\001\"\021\003.\006Q1/\032;UsB,W*\0319\025\007i\022y\013\003\005\0032\n%\006\031\001BZ\003\ri\027\r\035\t\007K\tU\006D!/\n\007\t]fEA\002NCB\004DAa/\003FB)\021D!0\003B&\031!qX\021\003\013\rc\027m]:\021\t\t\r'Q\031\007\001\t1\0219Ma,\002\002\003\005)\021\001Be\005\ryF%M\t\005\005\027\024\t\016E\002\033\005\033L1Aa4\034\005\035qu\016\0365j]\036\0042A\007Bj\023\r\021)n\007\002\004\003:L\bb\002Bm\001\021\005#1\\\001\bSN4\026\r\\5e)\r\001&Q\034\005\b\005?\0249\0161\001~\003\035!\030.\\3pkRDaAa9\001\t\003\032\027!D4fi\006+Ho\\\"p[6LG\017\003\004\003h\002!\t%_\001\016G2,\027M],be:LgnZ:\t\017\t-\b\001\"\021\002\"\006Iq-\032;TG\",W.\031\005\007\005_\004A\021\t?\002#\035,GOT3uo>\0248\016V5nK>,H\017\003\004\003t\002!\teY\001\tSN\034En\\:fI\"1!q\037\001\005Bq\fqcZ3u)J\fgn]1di&|g.S:pY\006$\030n\0348\t\017\tm\b\001\"\021\003~\006a1M]3bi\026\034FO];diR1!q`B\003\007\017\0012!EB\001\023\r\031\031A\005\002\007'R\024Xo\031;\t\017\t%$\021 a\0011!A1\021\002B}\001\004\021y'\001\006biR\024\030NY;uKNDqa!\004\001\t\003\032y!A\007hKR\034E.[3oi&sgm\034\013\0041\rE\001bBAB\007\027\001\r\001\007\005\b\007\033\001A\021IB\013)\005!\003bBB\r\001\021\00531D\001\013O\026$H+\0379f\033\006\004HCAB\017!\031)#Q\027\r\004 A\"1\021EB\023!\025I\"QXB\022!\021\021\031m!\n\005\031\r\0352qCA\001\002\003\025\tA!3\003\007}##\007C\004\004,\001!\te!\f\002\rUtwO]1q+\021\031yca\r\025\t\rE2q\007\t\005\005\007\034\031\004\002\005\0046\r%\"\031\001Be\005\005!\006\002CB\035\007S\001\raa\017\002\013%4\027mY3\021\013e\021il!\r\t\017\r}\002\001\"\021\004B\005a\021n],sCB\004XM\035$peR\031\001ka\021\t\021\re2Q\ba\001\007\013\002Daa\022\004LA)\021D!0\004JA!!1YB&\t1\031iea\021\002\002\003\005)\021\001Be\005\ryFe\r")
//public class MoonboxConnection implements Connection {
//    private final String url;
//
//    private final Properties props;
//
//    private JdbcSession jdbcSession;
//
//    private MoonboxStatement statement;
//
//    private boolean isLocal;
//
//    private boolean _readOnly;
//
//    public MoonboxConnection(String url, Properties props) {}
//
//    private JdbcSession jdbcSession() {
//        return this.jdbcSession;
//    }
//
//    private void jdbcSession_$eq(JdbcSession x$1) {
//        this.jdbcSession = x$1;
//    }
//
//    private MoonboxStatement statement() {
//        return this.statement;
//    }
//
//    private void statement_$eq(MoonboxStatement x$1) {
//        this.statement = x$1;
//    }
//
//    private boolean isLocal() {
//        return this.isLocal;
//    }
//
//    private void isLocal_$eq(boolean x$1) {
//        this.isLocal = x$1;
//    }
//
//    private boolean _readOnly() {
//        return this._readOnly;
//    }
//
//    private void _readOnly_$eq(boolean x$1) {
//        this._readOnly = x$1;
//    }
//
//    public boolean init() {
//        Properties newProps = MoonboxJDBCUtils$.MODULE$.parseURL(this.url, this.props);
//        String username = newProps.getProperty(MoonboxJDBCUtils$.MODULE$.USER_KEY());
//        String pwd = newProps.getProperty(MoonboxJDBCUtils$.MODULE$.PASSWORD_KEY());
//        isLocal_$eq(Option$.MODULE$.apply(newProps.getProperty(MoonboxJDBCUtils$.MODULE$.IS_LOCAL_KEY())).exists((Function1)new MoonboxConnection$$anonfun$init$1(this)));
//        Tuple2 tuple2 = (Tuple2)((IterableLike)MoonboxJDBCUtils$.MODULE$.parseHostsAndPorts(newProps.getProperty(MoonboxJDBCUtils$.MODULE$.HOSTS_AND_PORTS())).map((Function1)new MoonboxConnection$$anonfun$1(this), Seq$.MODULE$.canBuildFrom())).head();
//        if (tuple2 != null) {
//            String host = (String)tuple2._1();
//            int port = tuple2._2$mcI$sp();
//            Tuple2 tuple21 = new Tuple2(host, BoxesRunTime.boxToInteger(port)), tuple22 = tuple21;
//            String str1 = (String)tuple22._1();
//            int i = tuple22._2$mcI$sp();
//            ClientOptions clientOptions = ClientOptions$.MODULE$.builder()
//                    .options(((TraversableOnce)JavaConverters$.MODULE$.propertiesAsScalaMapConverter(newProps).asScala()).toMap(Predef$.MODULE$.$conforms()))
//                    .host(str1)
//                    .port(i)
//                    .user(username)
//                    .password(pwd)
//                    .isLocal(isLocal())
//                    .database(newProps.getProperty(MoonboxJDBCUtils$.MODULE$.DB_NAME(), "default"))
//                    .build();
//            try {
//                MoonboxClient moonboxClient =
//                        MoonboxClient$.MODULE$.builder(clientOptions).build();
//                initSession(moonboxClient, clientOptions, newProps);
//                return true;
//            } catch (Exception exception) {
//                throw new SQLException(exception.getMessage());
//            }
//        }
//        throw new MatchError(tuple2);
//    }
//
//    public final class MoonboxConnection$$anonfun$init$1 extends AbstractFunction1<String, Object> implements Serializable {
//        public static final long serialVersionUID = 0L;
//
//        public final boolean apply(String x$1) {
//            return (new StringOps(Predef$.MODULE$.augmentString(x$1))).toBoolean();
//        }
//
//        public MoonboxConnection$$anonfun$init$1(MoonboxConnection $outer) {}
//    }
//
//    public final class MoonboxConnection$$anonfun$1 extends AbstractFunction1<Tuple2<String, String>, Tuple2<String, Object>> implements Serializable {
//        public static final long serialVersionUID = 0L;
//
//        public final Tuple2<String, Object> apply(Tuple2 x0$1) {
//            Tuple2 tuple2 = x0$1;
//            if (tuple2 != null) {
//                String h = (String)tuple2._1(), p = (String)tuple2._2();
//                return new Tuple2(h, BoxesRunTime.boxToInteger((new StringOps(Predef$.MODULE$.augmentString(p))).toInt()));
//            }
//            throw new MatchError(tuple2);
//        }
//
//        public MoonboxConnection$$anonfun$1(MoonboxConnection $outer) {}
//    }
//
//    private void initSession(MoonboxClient moonboxClient, ClientOptions clientOptions, Properties props) {
//        if (clientOptions.password().isDefined() && ((String)clientOptions.password().get()).length() > 0) {
//            jdbcSession_$eq(new JdbcSession(moonboxClient,
//                    clientOptions.database(),
//                    (String)clientOptions.user().get(),
//                    "*",
//                    props,
//                    clientOptions.isLocal(), JdbcSession$.MODULE$.apply$default$7(), JdbcSession$.MODULE$.apply$default$8()));
//        } else {
//            jdbcSession_$eq(new JdbcSession(moonboxClient,
//                    clientOptions.database(),
//                    (String)clientOptions.user().get(),
//                    "*",
//                    props,
//                    clientOptions.isLocal(), JdbcSession$.MODULE$.apply$default$7(), JdbcSession$.MODULE$.apply$default$8()));
//        }
//    }
//
//    public JdbcSession getSession() {
//        return jdbcSession();
//    }
//
//    public void commit() {}
//
//    public int getHoldability() {
//        return 1;
//    }
//
//    public void setCatalog(String catalog) {
//        jdbcSession().moonboxClient().setCurrentDatabase(catalog);
//        JdbcSession qual$1 = jdbcSession();
//        String x$3 = catalog;
//        MoonboxClient x$4 = qual$1.copy$default$1();
//        String x$5 = qual$1.copy$default$3(), x$6 = qual$1.copy$default$4();
//        Properties x$7 = qual$1.copy$default$5();
//        boolean x$8 = qual$1.copy$default$6();
//        String x$9 = qual$1.copy$default$7();
//        long x$10 = qual$1.copy$default$8();
//        jdbcSession_$eq(qual$1.copy(x$4, x$3, x$5, x$6, x$7, x$8, x$9, x$10));
//    }
//
//    public void setHoldability(int holdability) {}
//
//    public PreparedStatement prepareStatement(String sql) {
//        throw new SQLException("Unsupported");
//    }
//
//    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) {
//        throw new SQLException("Unsupported");
//    }
//
//    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) {
//        throw new SQLException("Unsupported");
//    }
//
//    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) {
//        throw new SQLException("Unsupported");
//    }
//
//    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) {
//        throw new SQLException("Unsupported");
//    }
//
//    public PreparedStatement prepareStatement(String sql, String[] columnNames) {
//        throw new SQLException("Unsupported");
//    }
//
//    public Clob createClob() {
//        throw new SQLException("Unsupported");
//    }
//
//    public void setSchema(String schema) {
//        jdbcSession().moonboxClient().setCurrentDatabase(schema);
//        JdbcSession qual$2 = jdbcSession();
//        String x$11 = schema;
//        MoonboxClient x$12 = qual$2.copy$default$1();
//        String x$13 = qual$2.copy$default$3(), x$14 = qual$2.copy$default$4();
//        Properties x$15 = qual$2.copy$default$5();
//        boolean x$16 = qual$2.copy$default$6();
//        String x$17 = qual$2.copy$default$7();
//        long x$18 = qual$2.copy$default$8();
//        jdbcSession_$eq(qual$2.copy(x$12, x$11, x$13, x$14, x$15, x$16, x$17, x$18));
//    }
//
//    public void setClientInfo(String name, String value) {}
//
//    public void setClientInfo(Properties properties) {}
//
//    public SQLXML createSQLXML() {
//        throw new SQLException("Unsupported");
//    }
//
//    public String getCatalog() {
//        return jdbcSession().moonboxClient().getCurrentDatabase();
//    }
//
//    public Blob createBlob() {
//        throw new SQLException("Unsupported");
//    }
//
//    public void checkClosed() {
//        if (isClosed())
//            throw new SQLException("Connection has already been closed.");
//    }
//
//    public Statement createStatement() {
//        checkClosed();
//        statement_$eq(new MoonboxStatement(this));
//        return statement();
//    }
//
//    public Statement createStatement(int resultSetType, int resultSetConcurrency) {
//        return createStatement();
//    }
//
//    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) {
//        return createStatement();
//    }
//
//    public void abort(Executor executor) {
//        close();
//    }
//
//    public void setAutoCommit(boolean autoCommit) {}
//
//    public DatabaseMetaData getMetaData() {
//        return new MoonboxDatabaseMetaData(this);
//    }
//
//    public void setReadOnly(boolean readOnly) {
//        _readOnly_$eq(readOnly);
//    }
//
//    public CallableStatement prepareCall(String sql) {
//        throw new SQLException("Unsupported");
//    }
//
//    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) {
//        throw new SQLException("Unsupported");
//    }
//
//    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) {
//        throw new SQLException("Unsupported");
//    }
//
//    public void setTransactionIsolation(int level) {}
//
//    public SQLWarning getWarnings() {
//        throw new SQLException("Unsupported");
//    }
//
//    public void releaseSavepoint(Savepoint savepoint) {
//        throw new SQLException("Unsupported");
//    }
//
//    public String nativeSQL(String sql) {
//        throw new SQLException("Unsupported");
//    }
//
//    public boolean isReadOnly() {
//        return _readOnly();
//    }
//
//    public Array createArrayOf(String typeName, Object[] elements) {
//        throw new SQLException("Unsupported");
//    }
//
//    public Savepoint setSavepoint() {
//        throw new SQLException("Unsupported");
//    }
//
//    public Savepoint setSavepoint(String name) {
//        throw new SQLException("Unsupported");
//    }
//
//    public void close() {
//        if (statement() != null && !statement().isClosed())
//            statement().close();
//        statement_$eq(null);
//        if (jdbcSession() != null || !jdbcSession().isClosed())
//            jdbcSession().close();
//        jdbcSession_$eq(null);
//    }
//
//    public NClob createNClob() {
//        throw new SQLException("Unsupported");
//    }
//
//    public void rollback() {}
//
//    public void rollback(Savepoint savepoint) {}
//
//    public void setNetworkTimeout(Executor executor, int milliseconds) {
//        jdbcSession().setReadTimeout(milliseconds);
//    }
//
//    public void setTypeMap(Map map) {}
//
//    public boolean isValid(int timeout) {
//        return !isClosed();
//    }
//
//    public boolean getAutoCommit() {
//        return false;
//    }
//
//    public void clearWarnings() {}
//
//    public String getSchema() {
//        return jdbcSession().moonboxClient().getCurrentDatabase();
//    }
//
//    public int getNetworkTimeout() {
//        return jdbcSession().getReadTimeout();
//    }
//
//    public boolean isClosed() {
//        return (jdbcSession() == null || jdbcSession().isClosed());
//    }
//
//    public int getTransactionIsolation() {
//        return 0;
//    }
//
//    public Struct createStruct(String typeName, Object[] attributes) {
//        throw new SQLException("Unsupported");
//    }
//
//    public String getClientInfo(String name) {
//        throw new SQLException("Unsupported");
//    }
//
//    public Properties getClientInfo() {
//        throw new SQLException("Unsupported");
//    }
//
//    public Map<String, Class<?>> getTypeMap() {
//        throw new SQLException("Unsupported");
//    }
//
//    public <T> T unwrap(Class<?> iface) {
//        if (isWrapperFor(iface))
//            return (T)this;
//        throw new SQLException("unwrap exception");
//    }
//
//    public boolean isWrapperFor(Class iface) {
//        return (iface != null && iface.isAssignableFrom(getClass()));
//    }
//}
