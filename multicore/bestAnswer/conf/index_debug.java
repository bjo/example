IndexReader r = IndexReader.open( "prdb_index");

int num = r.numDocs();
for ( int i = 0; i < num; i++)
{
    if ( ! r.isDeleted( i))
    {
        Document d = r.document( i);
        System.out.println( "d=" +d);
    }
}
r.close();
