package com.playground.exportTest;
import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.tool.Exporter;

import com.playground.exportTest.model.Measurement;

public class Application
{
      public static void main(String[] args)
      {
            final Nitrite db = Nitrite.builder().autoCommitBufferSize( 1024 ).compressed()
          .filePath( "test.db" ).openOrCreate();

          final ObjectRepository<Measurement> shortTerm = Application.createCollection("id", db);
          //final ObjectRepository<Measurement> longTerm = Application.createCollection("longTermMeasurements", db);

            Measurement emp = new Measurement()
                  .configId(124589)
                  .connectorId( 1 )
                  .id( 1 )
                  .name("measurement1");

            shortTerm.insert(emp);

          Exporter exporter = Exporter.of(db);
          exporter.exportTo("E:\\bernhardrapp\\Playground\\nitride-db-test\\test.json");
      }

      public static ObjectRepository<Measurement> createCollection(final String key, final Nitrite db)
      {
            final ObjectRepository<Measurement> objectRepository =
                db.getRepository(key, Measurement.class );
            return objectRepository;
      }
}


