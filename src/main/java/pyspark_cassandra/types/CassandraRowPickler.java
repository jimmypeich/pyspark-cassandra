/*
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package pyspark_cassandra.types;

import scala.collection.IndexedSeq;

import com.datastax.spark.connector.CassandraRow;

public class CassandraRowPickler extends StructPickler {
	public String getCreator() {
		return "pyspark_cassandra.types\n_create_row\n";
	}

	@Override
	public IndexedSeq<String> getFieldNames(Object o) {
		return ((CassandraRow) o).fieldNames();
	}

	@Override
	public IndexedSeq<Object> getFieldValues(Object o) {
		return ((CassandraRow) o).fieldValues();
	}
}